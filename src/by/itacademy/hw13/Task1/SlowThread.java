package by.itacademy.hw13.Task1;

public class SlowThread implements Runnable {
    public static Object getA() {
        return a;
    }
    private static final Object a = new Object();

    @Override
    public void run() {
        try {
            synchronized (a) {
                a.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}