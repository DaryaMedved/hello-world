package by.itacademy.hw4;
import java.util.Arrays;
public class Task4 {
    static double max = 0;
    public static final double[] array = new double[]{1.8, 0.9, 9.92, 1.7, 2.99, 7.5};
        public static void main(String[] args) {
            findMax(array);
            findMin(array);
        }

        public static void findMax(double[] array) {
            Arrays.sort(array);
            max = array[array.length - 1];
            System.out.println(max);
        }

        public static void findMin(double[] array) {
            double min = array[0];
            for (double v : array) {
                if (v < array[0]) {
                    min = v;
                }
            }
            System.out.println(min);
        }

        public static void findIndexOfMax() {

        }
    }


