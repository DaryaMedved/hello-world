package by.itacademy.hw7.Task2;

import java.util.Scanner;

interface ConverterDegree {
    Scanner sc = new Scanner(System.in);

    static double input(String word) {
        System.out.println("Enter " + word + " value:");
        return sc.nextDouble();
    }

    static void output(double val, String word) {
        System.out.printf("%s value: %.2f", word, val);
    }
}
