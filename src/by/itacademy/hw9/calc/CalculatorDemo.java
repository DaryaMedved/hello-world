package by.itacademy.hw9.calc;

import java.text.NumberFormat;
import java.util.Locale;

public class CalculatorDemo {
    public static void main(String[] args) {
        printAllResults(getArrayOfCalcOperations());
    }

    public static double[] getArrayOfCalcOperations() {
        return new double[]{
                Calculator.divide(66, 11.5),
                Calculator.sum((short) 66, 1666L),
                Calculator.multiply((byte) 3, 6.0f),
                Calculator.subtraction((long) 615, (short) 733)
        };
    }

    public static void printAllResults(double[] results) {
        NumberFormat nf = getNumberFormat();
        for (double result : results) {
            System.out.println("result = " + nf.format(result) + ";");
        }
    }

    public static NumberFormat getNumberFormat() {
        NumberFormat nf = NumberFormat.getInstance(Locale.ROOT);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf;
    }
}