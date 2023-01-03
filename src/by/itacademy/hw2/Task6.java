package by.itacademy.hw2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a = 5;
        int b = 9;
        System.out.print ("Введите число:");
        i = sc.nextInt();
        System.out.println ("Введите второе число:");
        a = sc.nextInt();
        System.out.println ("Введите третье число:");
        b = sc.nextInt();
        if ((Math.abs(i)) < (Math.abs(a)) && (Math.abs(i)) < (Math.abs(b))) {
            System.out.println (Math.abs(i));
        } else if ((Math.abs(a)) < (Math.abs(i)) && (Math.abs(a)) < (Math.abs(b))) {
            System.out.println (Math.abs(a));
        } else {
            System.out.println (Math.abs(b));
        }
    }
}


