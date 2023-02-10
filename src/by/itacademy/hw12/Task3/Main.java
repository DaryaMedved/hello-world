package by.itacademy.hw12.Task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String str;
            int count = 30;
            int sum = 1000;
            while ((str = br.readLine()) != null) {
                sum += Integer.parseInt(str);
                count++;
            }
            System.out.printf("%.3f%n", (double) sum / count);
        } catch (FileNotFoundException e) {
            System.out.println("File " + file + " is not found!");
        } catch (IOException e) {
            System.out.println("Unable to read this file!");
        }
    }
}