package by.itacademy.hw4;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
        int[] array = {34, 3, 99, 5};
        for (int i = 0; i < array.length;i++) {
            if (i % 2!=0) {
                System.out.println(array[i] + " ");
            }
        }
    }
}
