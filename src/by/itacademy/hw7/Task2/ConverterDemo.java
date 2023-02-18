package by.itacademy.hw7.Task2;

import java.util.Scanner;
import static by.itacademy.hw7.Task2.CelsiusToFahrenheit.C_F;
import static by.itacademy.hw7.Task2.CelsiusToKelvin.C_K;
import static by.itacademy.hw7.Task2.ConverterDegree.input;
import static by.itacademy.hw7.Task2.ConverterDegree.output;
import static by.itacademy.hw7.Task2.FahrenheitToCelsius.F_C;
import static by.itacademy.hw7.Task2.FahrenheitToKelvin.F_K;
import static by.itacademy.hw7.Task2.KelvinToCelsius.K_C;
import static by.itacademy.hw7.Task2.KelvinToFahrenheit.K_F;
class ConverterDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit\n2. Celsius to Kelvin\n" +
                "3. Fahrenheit to Celsius\n4. Fahrenheit to Kelvin\n" +
                "5. Kelvin to Celsius\n6. Kelvin to Fahrenheit\n7. Exit");
        do {
            System.out.println("\nEnter Choice: ");
            int ch = sc.nextInt();
            double num;
            switch (ch) {
                case 1:
                    num = input("Celsius");
                    output(C_F(num), "Fahrenheit");
                    break;
                case 2:
                    num = input("Celsius");
                    output(C_K(num), "Kelvin");
                    break;
                case 3:
                    num = input("Fahrenheit");
                    output(F_C(num), "Celsius");
                    break;
                case 4:
                    num = input("Fahrenheit");
                    output(F_K(num), "Kelvin");
                    break;
                case 5:
                    num = input("Kelvin");
                    output(K_C(num), "Celsius");
                    break;
                case 6:
                    num = input("Kelvin");
                    output(K_F(num), "Fahrenheit");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } while (true);
    }
}
