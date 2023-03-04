package by.itacademy.hw15and16.task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class DemoStreamAPI {
    public static void main(String[] args) {
        Collection<String> col = Arrays.asList("generic", "lage", "logic",
                "login", "dress", "cat");

        boolean match = col.stream().anyMatch(Predicate.isEqual("login"));
        System.out.println(match);
        System.out.println();

        System.out.println(col.stream().min(((o1, o2) -> Integer.compare(o2.length(), o1.length()))).get());

        System.out.println(col.stream().max(((o1, o2) -> Integer.compare(o2.length(), o1.length()))).get());

        System.out.println();

        col.stream().filter(s -> s.matches("\\w*[a-zA-z]*")).forEach(System.out::println);

        System.out.println();
        col.stream().flatMap(o1 -> Arrays.stream(o1.split(" "))).forEach(System.out::println);
    }
}


