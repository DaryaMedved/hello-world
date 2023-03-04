package by.itacademy.hw14.Task1;
import java.util.Date;
import java.util.Scanner;

public class ServiceFlow {
    public static class ShowTime extends Thread {
        public void run() {

            while (true) {

                Date time = new Date();
                String stringBuilder = time.getHours() +
                        ":" +
                        time.getMinutes() +
                        ":" +
                        time.getSeconds();
                System.out.println(stringBuilder);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {

        ShowTime time = new ShowTime();
        Scanner breaker = new Scanner(System.in);
        time.start();
        if (breaker.nextInt() == 1) {
            time.stop();
        }
    }
}

