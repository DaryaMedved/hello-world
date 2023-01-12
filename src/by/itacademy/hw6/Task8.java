package by.itacademy.hw6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        System.out.print("Введите текст: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Pattern p1 = Pattern.compile("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
        Matcher m1 = p1.matcher(str);
        boolean b = m1.matches();
        System.out.println(b);


    }
}