package by.itacademy.hw4;

public class Task1 {
    public static void main(String[] args) {
        int i,j;
        System.out.print(" * |");
        for(i=1; i<10; i++)
            System.out.printf("%2d ", i);
        System.out.print("\n---|------------");
        System.out.print("----------------\n");
        for(i=1; i<10; i++)
        {
            System.out.printf("%2d |", i);
            for(j=1; j<10; j++)
                System.out.printf("%2d ", i*j);
            System.out.print("\n");
        }

    }

}







