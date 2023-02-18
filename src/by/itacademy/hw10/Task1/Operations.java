package by.itacademy.hw10.Task1;
import java.util.HashSet;
import java.util.Set;

public class Operations {
    protected static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    protected static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        HashSet<T> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }
    protected static void printSet(String name, Set set) {
        System.out.printf("%s: %s\n", name, set);
    }
}

