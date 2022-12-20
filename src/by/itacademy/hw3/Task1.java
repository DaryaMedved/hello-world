package by.itacademy.hw3;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner((System.in));
        System.out.print("Введите число: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("Положительное число");
        }
        else if (input < 0)
        {
            System.out.println("Отрицательное число");
        }
        else
        {
            System.out.println("число рано нулю");
        }
    }
}
