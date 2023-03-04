package by.itacademy.hw13.Task1;

import static java.lang.Thread.sleep;

public class StatesStart {
    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new SomeThread());
            Thread thread2 = new Thread(new SlowThread());
            System.out.println(thread.getState() + " new");
            thread.start();
            thread2.start();
            sleep(500);
            System.out.println(thread.getState() + " timed_waiting");
            System.out.println(thread2.getState() + " waiting");
            Object a = SlowThread.getA();

            synchronized (a) {
                a.notify();
            }

            System.out.println(thread2.getState() + " blocked");
            sleep(2000);
            System.out.println(thread.getState() + " terminated");
            sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
