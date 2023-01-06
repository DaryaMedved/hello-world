package by.itacademy.hw4;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int[] array = {34, 54, 92, 5, 99, 4};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);
    }
}