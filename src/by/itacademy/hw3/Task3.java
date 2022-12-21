package by.itacademy.hw3;
import java.util.*;
public class Task3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("Понедельник");
        }
        if (number == 2) {
            System.out.println("Вторник");
        }
        if (number == 3) {
            System.out.println("Среда");
        }
        if (number == 4) {
            System.out.println("Четверг");
        }
        if (number == 5) {
            System.out.println("Пятница");
        }
        if (number == 6 || number == 7) {
            System.out.println("Выходной");
        } else if (number == -1 || number >= 8) {
            System.out.println("Ошибка");
        }

    }
}
