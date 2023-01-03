package by.itacademy.hw6;
public class Task1 {

    public static void main(String[] args) {

        String x = "   Котики  спасут   мир  :  ^ Мяу -  Мяу   - Мяу  ^ ";
        while (x.contains("  ")) {
            String replace = x.replace("  ", " ");
            x = replace;
        }
        System.out.println(x);
    }
}