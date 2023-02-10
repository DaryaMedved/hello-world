package by.itacademy.hw12.Task1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class SortFile {

    public static void main(String[] args) throws IOException {

        System.out.println("Открываем файл...");
        FileReader fin = new FileReader("in1.txt");
        FileReader fin1 = new FileReader("in2.txt");

        int c;
        int number=0;
        boolean ncheck = false;
        ArrayList<Integer> n = new ArrayList<>();
        System.out.println("Считываем данные....");
        while ((c = fin.read()) != -1){
            if (c>=48 && c<58){
                number = number*10+Character.getNumericValue((char)c);
                ncheck=true;
            }
            else if(ncheck){
                n.add(number);
                number=0;
                ncheck=false;
            }

        }
        if(ncheck){
            n.add(number);
        }

        System.out.println("Сортируем данные...");
        Collections.sort(n);


        FileWriter fw = new FileWriter(("out.txt"));
        for(int i : n){
            fw.write(Integer.toString(i)+(char)13+(char)10);
            fw.flush();
        }
        System.out.println("Готово!");
    }
}

