package by.itacademy.hw2;

public class Task3 {
    public static void main(String[] args) {
        int s = 4200;
        int sec;
        int m;
        int min;
        int h;
        int day;
        int week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        day = (h - min) / 60;
        week = (day - h) / 60;


        System.out.println(week + "недель" + day + "дней" + h + "часов" + min + "минут" + sec + "секунд");
    }

}
