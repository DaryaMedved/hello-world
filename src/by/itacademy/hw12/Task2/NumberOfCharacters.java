package by.itacademy.hw12.Task2;

import java.io.File;
import java.io.FileInputStream;
/**
Task 2 hw12 Для подсчета количества символов в текстовом файле
**/
public class NumberOfCharacters {
    public static void main(String[] args) throws Exception{
        File file = new File("data");
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int)file.length()];

        fis.read(byteArray);
        String data = new String(byteArray);
        System.out.println("Number of characters in the String: "+data.length());
    }
}