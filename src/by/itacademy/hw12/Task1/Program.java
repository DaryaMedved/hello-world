package by.itacademy.hw12.Task1;
import java.io.*;

public class Program {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("in1.txt")) {

            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

