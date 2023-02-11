package by.itacademy.hw13.Task2;

public class TrainThreads2 {
    public static void main(String[] args) {

        int[] AI = {6, 76, 90, 4, 36, 7};

        ThreadMinMax t1 = new ThreadMinMax(AI);
        ThreadMinMax t2 = new ThreadMinMax(AI);

        try {

            t1.getThread().join();
            t2.getThread().join();

        } catch (InterruptedException e) {

            System.out.println("Error.");
        }

        System.out.println("max = " + t1.getMax());
        System.out.println("min = " + t1.getMin());
    }
}
