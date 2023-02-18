package by.itacademy.hw7;
import java.util.*;
class tempConverter{
    static Scanner sc = new Scanner(System.in);
    static double C_F(double C){
        return (C * 9/5) + 32;
    }
    static double C_K(double C){
        return C + 273.15;
    }

    static double F_C(double F){
        return (F - 32) * 5/9;
    }
    static double F_K(double F){

        return (F - 32) * 5/9 + 273.15;
    }

    static double K_C(double K){

        return K - 273.15;
    }

    static double K_F(double K){
        return (K - 273.15) * 9/5 + 32;
    }

    static double input(String word){
        System.out.println("Enter "+word+" value:");
        return sc.nextDouble();
    }

    static void output(double val, String word){
        System.out.printf("%s value: %.2f",word,val);
    }


    public static void main(String[] args){
        System.out.println("1. Celsius to Fahrenheit\n2. Celsius to Kelvin\n"+
                "3. Fahrenheit to Celsius\n4. Fahrenheit to Kelvin\n"+
                "5. Kelvin to Celsius\n6. Kelvin to Fahrenheit\n7. Exit");
        do{
            System.out.println("\nEnter Choice: ");
            int ch = sc.nextInt();
            double num = 0;
            switch(ch){
                case 1: num = input("Celsius");
                    output(C_F(num), "Fahrenheit");
                    break;
                case 2: num = input("Celsius");
                    output(C_K(num), "Kelvin");
                    break;
                case 3: num = input("Fahrenheit");
                    output(F_C(num), "Celsius");
                    break;
                case 4: num = input("Fahrenheit");
                    output(F_K(num), "Kelvin");
                    break;
                case 5: num = input("Kelvin");
                    output(K_C(num), "Celsius");
                    break;
                case 6: num = input("Kelvin");
                    output(K_F(num), "Fahrenheit");
                    break;
                case 7: System.exit(0);
                    break;
                default: System.out.println("Invalid Input");
            }
        }while(true);
    }
}