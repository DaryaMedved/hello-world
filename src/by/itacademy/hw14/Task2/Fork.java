package by.itacademy.hw14.Task2;

public class Fork {
    private static int count = 0;
    private final int id;
    private boolean isBusy;

    public Fork() {
        id = ++count;
        isBusy = false;
    }

    public synchronized void take() {
        if (isBusy) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " взял вилку " + id);
        isBusy = true;
    }

    public synchronized void drop() {
        System.out.println(Thread.currentThread().getName() + " положил вилку " + id);
        isBusy = false;
        notify();
    }
}
