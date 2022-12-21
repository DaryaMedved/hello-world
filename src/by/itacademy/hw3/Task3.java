package by.itacademy.hw3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String number = reader.readLine();
        int g = Integer.parseInt(number) ;
        switch (g) {
            case 1 : System.out.println("Понедельник");
                break ;
            case 2 : System.out.println("Вторник");
                break ;
            case 3 : System.out.println("Среда");
                break ;
            case 4 : System.out.println("Четверг");
                break ;
            case 5 : System.out.println("Пятница");
                break ;
            case 6: System.out.println("Выходной-Суббота");
                break ;
            case 7: System.out.println("Выходной-Воскресенье");
                break;
            default: System.out.println("Ошибка:такого дня недели не существует");
        }
    }
}


