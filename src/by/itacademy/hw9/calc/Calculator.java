package by.itacademy.hw9.calc;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }
}