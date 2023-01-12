package by.itacademy.hw6;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();
        String[] mas = s.split(" ");

        int maxl = mas[0].length();
        int minl = mas[0].length();
        String max = mas[0];
        String min = mas[0];
        int posmax = 0, posmin = 0;
        for (int i = 0; i <= mas.length - 1; i++) {
            if (mas[i].length() > maxl) {
                maxl = mas[i].length();
                max = mas[i];
                posmax = i;
            } else if (mas[i].length() < minl) {
                minl = mas[i].length();
                posmin = i;
                min = mas[i];
            }
        }
        mas[posmax] = min;
        mas[posmin] = max;
        System.out.println("Полученная строка: ");
        System.out.println(Arrays.toString(mas));
    }
}

