package by.itacademy.hw10.Task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        String str = "cat. is Very good friend...  World cat Very   ";

        Map<String, Integer> wordCounts = new HashMap<>();

        Arrays.stream(str.split("[ ,.]")).filter(w -> w.length() > 0)
                .forEach(w -> wordCounts.put(w, wordCounts.getOrDefault(w, 0) + 1));

        System.out.println(wordCounts);
    }
}
