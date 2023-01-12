package by.itacademy.hw4;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x= scanner.nextInt();
        int x1 = x;
        int sum = 0, mul = 1;
        while (x > 0){
            sum += x % 10;
            mul *= x % 10;
            x /= 10;
        }
        System.out.println("Сумма цифр числа " + x1 + " составляет: " + sum);
        System.out.printf("Произведение цифр числа "+ x1 + " составляет: " + mul);
    }
}
