package by.itacademy.hw15and16.task2;

import java.util.Arrays;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> col = Arrays.asList(6, 88, 13, 1, 44, 90);

        System.out.println("max " + col.stream().mapToInt(Integer::intValue).max().getAsInt());

        System.out.println("min " + col.stream().mapToInt(Integer::intValue).min().getAsInt());

        System.out.println("average " + col.stream().mapToInt(Integer::intValue).average().getAsDouble());

        System.out.println("multiply " + col.stream().mapToInt(Integer::intValue).reduce((r1, r2) -> r1 * r2).getAsInt());

        System.out.println("sum of " + col.stream().mapToInt(Integer::intValue).sum());
        int identity = 0;

        int result = col.stream().reduce(identity, (sum, x) -> {
            while (x != 0) {
                sum += x % 10;
                x /= 10;
            }
            return sum;
        });
        System.out.println("сумма цифр: " + result);

    }
}
