package by.itacademy.hw6;


public class Task3 {
    public static void main(String[] args) {
        String[] arrStr = {"Сегодня","очень","сильный","ветер"};
        for (String s : arrStr) {
            System.out.print(s + ' ');
        }
        System.out.println();
        for (int i = arrStr.length - 1; i >= 0; i--) {
            System.out.print(arrStr[i] + ' ');
        }
    }
}
