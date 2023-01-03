package by.itacademy.hw3;
import java.util.*;
public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if ((x<y) && (y<z)) System.out.println(x+" "+y+" "+z);
        if ((y<x) && (x<z)) System.out.println(y+" "+x+" "+z);
        if ((x<z) && (z<y)) System.out.println(x+" "+z+" "+y);
        if ((z<x) && (x<y)) System.out.println(z+" "+x+" "+y);
        if ((z<y) && (y<x)) System.out.println(z+" "+y+" "+x);
        if ((y<z) && (z<x)) System.out.println(y+" "+z+" "+x);

    }

}



