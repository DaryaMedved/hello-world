package by.itacademy.hw4;
import java.util.Arrays;
public class Task6 {
    public static void main(String[] args) {
        int[] arr1 = {1, -9, 8, 10, -26, 77, -15, 66};
        int pos = 0;
        int neg = 0;
        for (int x : arr1) {
            if (x > 0) {
                pos++;
            } else {
                neg++;
            }
        }

        int[] arrpos = new int[pos];
        int[] arrneg = new int[neg];

        int countpos = 0;
        int countneg = 0;
        for (int x : arr1) {
            if (x > 0) {
                arrpos[countpos] = x;
                countpos++;
            } else {
                arrneg[countneg] = x;
                countneg++;
            }
        }

        System.out.println(Arrays.toString(arrneg));
        System.out.println(Arrays.toString(arrpos));
    }
}