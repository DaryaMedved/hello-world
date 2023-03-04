package by.itacademy.hw13.Task3;

public class DemoThread {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append('1');
        MyThread[] threads = new MyThread[]{
                new MyThread(sb),
                new MyThread(sb),
                new MyThread(sb)
        };
        for (MyThread thread : threads) {
            thread.start();
        }
    }
}
