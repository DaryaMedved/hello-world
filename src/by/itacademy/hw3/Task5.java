package by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите четверть: ");
        int input = sc.nextInt();

        int min = 10;
        if(min >= 0 && min <= 14){
            System.out.println("В первую четверть.");
        }
        else if(min >= 15 && min <= 30){
            System.out.println("Во вторую четверть.");
        }
        else if(min >= 31 && min <= 45){
            System.out.println("В третью четверть.");
        }
        else{
            System.out.println("В четвертую четверть.");
        }


    }
}
