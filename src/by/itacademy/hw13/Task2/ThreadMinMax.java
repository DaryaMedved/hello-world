package by.itacademy.hw13.Task2;


public class ThreadMinMax implements Runnable {
    private final Thread thr;
    private final int[] AI;
    private int maximum;
    private int minimum;


    public ThreadMinMax(int[] _AI) {

        AI = _AI;

        thr = new Thread(this, "Thread1.");

        thr.start();
    }

    public void run() {
        int max = AI[0];
        int min = AI[0];
        for (int i=1; i<AI.length; i++) {
            if (max<AI[i]) max = AI[i];
            if (min>AI[i]) min = AI[i];
        }
        maximum = max;
        minimum = min;
    }

    public Thread getThread() { return thr; }
    public int getMax() { return maximum; }
    public int getMin() { return minimum; }
}

