package by.itacademy.hw4;

public class Task7 {
    public static void main(String[] args) {
        int i;
        int n = 22;
        int[] per = new int[n];

        System.out.println("Изначальный массив: ");

        for (i = 0; i < n; i++) {
            per[i] = (int) (Math.random() * 23);
            System.out.print(" " + per[i]);
        }
        for (i = 0; i < n / 2; i++) {
            int z = per[i];
            per[i] = per[n - 1 - i];
            per[n - 1 - i] = z;
        }
        System.out.println("\n ");
        System.out.println("Перевернутый массив : ");
        for (i = 0; i < n; i++) {
            System.out.print(" " + per[i]);
        }
    }
}


