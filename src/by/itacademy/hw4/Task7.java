package by.itacademy.hw4;

public class Task7 {
    public static void main(String[] args)
    {
        System.out.println("Начало ");
        int n=9;
        int[] number =new int[n];
        for (int i=0;i<n;i++)
        {
            number[i]=(int)(Math.random()*10+1);
            System.out.print(" "+number[i]);
        }
        for (int i=0;i<n/2;i++)
        {
            int j=number[i];
            number[i]=number[n-1-i];
            number[n-1-i]=j;
        }
        System.out.println("\n ");
        System.out.println("Перевернутый массив ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + number[i]);

        }
    }
}

