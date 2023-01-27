package by.itacademy.hw10.Task2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String st = "Do you like cats I really like cats";

        String[] words = st.split(" ");

        HashMap<String, Integer> keyValue = new HashMap<>();

        for (int i = 0; i <= words.length - 1; i++) {

            if (keyValue.containsKey(words[i])) {

                int counter = keyValue.get(words[i]);

                keyValue.put(words[i], counter + 1);

            } else {

                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);

    }
}


