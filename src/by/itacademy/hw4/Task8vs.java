package by.itacademy.hw4;

public class Task8vs {
    private static int[] sortArr;

    public static void insertionSort(int[] sortArr) {
        Task8vs.sortArr = sortArr;
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }
    public static void main(String args[]) {
        int[] sortArr = {10, 56, 7, 91, 105, 1};
        insertionSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
}