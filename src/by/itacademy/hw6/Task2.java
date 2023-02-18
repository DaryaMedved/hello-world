package by.itacademy.hw6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task2 {
    public static void main(String[] args) {
        String text = "123456asd88";
        int maxLen = 0;

        Matcher m = Pattern.compile("(.)\\1+").matcher(text);
        while (m.find()) {
            String sub = m.group();
            System.out.println(sub);

            if (sub.length() > maxLen) {
                maxLen = sub.length();
            }
        }
        System.out.println("\nmaxLen: " + maxLen);
    }
}
