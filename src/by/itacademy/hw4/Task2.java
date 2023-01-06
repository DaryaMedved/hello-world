package by.itacademy.hw4;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < 3; i++) {
            mul *= x % 10;
            sum += x % 10;
            x /= 10;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + mul);
    }
}
