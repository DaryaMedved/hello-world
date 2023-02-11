package by.itacademy.hw13.Task1;

import static java.lang.Thread.sleep;

public class SomeThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState()+ " runnable");
        try {
            sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}