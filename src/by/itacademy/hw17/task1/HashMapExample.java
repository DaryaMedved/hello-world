package by.itacademy.hw17.task1;

import java.util.*;
import java.util.function.BiFunction;

public class HashMapExample {
    public static void main(String[] args) {
        System.out.println("java.util.HashMap<K,V> Example ");

        Map<Integer, String> week = new HashMap<>();

        Map<String, Integer> counts = new HashMap<>(4, 0.6f);

        System.out.println("Добавление");

        week.put(1, "Понедельник");
        week.put(2, "Вторник");
        week.put(3, "Среда");
        week.put(4, "Четверг");
        week.put(5, "Пятница");
        week.put(6, "Суббота");
        week.put(7, "Воскресенье");
        System.out.println("- добавленные элементы week put(): " + week);

        counts.put("знание", 1);
        counts.put("сила", 1);
        System.out.println("- добавленные элементы counts put(): " + counts);


        System.out.println("Получение элементов и информации: ");

        System.out.println("- поиск по ключу 7 get(): " + week.get(7));

        System.out.println("- поиск по ключу 0 getOrDefault(): " + week.getOrDefault(0, "Неизвестный"));


        System.out.println(" - получение элементов цикл for-each: ");
        for (Map.Entry<Integer, String> entry : week.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("   key = " + key + ", value = " + value);
        }


        System.out.print("- получение множества ключей keySet(): ");
        Set<String> keys = counts.keySet();
        for (String key : keys) {
            System.out.print(key + " ");
        }
        System.out.println();


        System.out.print("- получение коллекции значений values(): ");
        Collection<Integer> values = counts.values();
        for (Integer value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("- обработка всех значений методом forEach(): ");
        counts.forEach((k, v) -> System.out.println("  word: " + k + " - counts: " + v));


        System.out.println("Обновление ");

        week.put(7, "ВС.");
        System.out.println("- по ключу 7 put(): " + week);

        week.replace(7, "ВС.", "Вс");
        System.out.println("- по ключу 7 старого на новое значение replace(): " + week);

        week.replace(7, "Воскресенье");
        System.out.println("- по ключу 7 replace(): " + week);

        week.putIfAbsent(0, "Неизвестный");
        System.out.println("- обновление, если значение отсутствовало putIfAbsent(): " + week);


        BiFunction<Integer, String, String> joinKV = (k, v) -> k.toString() + "-" + v;

        week.replaceAll(joinKV);
        System.out.println("- замена всех значений replaceAll(): " + week);

        counts.compute("знание", (key, oldValue) -> oldValue + 1);
        System.out.println("- вычисление нового значения compute(): " + counts);


        counts.merge("знание", 1, Integer::sum);
        System.out.println("- объединение merge(): " + counts);

        System.out.println("- содержит ключ 1 containsKey: " + week.containsKey(1));
        System.out.println("- содержит значение Понедельник containsValue(): " + week.containsValue("Понедельник"));
        System.out.println("- размер size(): " + week.size());
        System.out.println("- пустое isEmpty():" + week.isEmpty());


        System.out.println("Удаление");

        week.remove(0);
        System.out.println("- по ключу 0 remove(): " + week);

        counts.remove("сила", 1);
        System.out.println("- по ключу и значению remove(): " + counts);

        counts.clear();
        System.out.println("- очистка clear(): " + counts);
    }
}