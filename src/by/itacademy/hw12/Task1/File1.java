package by.itacademy.hw12.Task1;

import java.io.*;

public class File1 {

    public static void main(String[] args) throws Exception {
        int k1 = 1;
        int k2 = 100000;
        newFile(k1, k2);

    }


    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("in1.txt");

        for (int i = k1; i <= k2; i++) {

            nFile.write(i + "\n");
        }

        nFile.close();
    }
}
