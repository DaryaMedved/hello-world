package by.itacademy.hw3;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите первое число");
        int a = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        int myltiplication = a * b;

        System.out.printf("Сколько будет %d умножить на %d?", a, b);
        int userAnswer = scanner.nextInt();

        if(userAnswer == myltiplication) {
            System.out.println("Поздравляю! Вы знаете таблицу умножения");

        } else {
            System.out.printf("Неверный ответ!!! %d * %d = %d", a, b, myltiplication);
        }




    }
}