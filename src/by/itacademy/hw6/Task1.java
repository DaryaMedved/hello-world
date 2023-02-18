package by.itacademy.hw6;
public class Task1 {
    public static void main(String[] args) {

        String x = "   Котики  спасут   мир  :  ^ Мяу -  Мяу   - Мяу  ^ ";

        x = x.replace("  ", " ");

        System.out.println(x.replaceAll("\\s{2,}", " "));
    }
}