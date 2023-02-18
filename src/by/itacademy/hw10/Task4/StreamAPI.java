package by.itacademy.hw10.Task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void PrintAllPets(ArrayList<PetShop> AL) {
        Stream<PetShop> stream = AL.stream();
        Consumer<PetShop> action = (n) -> System.out.println(n.getNickname()
                + ", " + n.getNickname()
                + ", " + n.getName()
                + ", " + n.getColor()
                + ", " + n.getAge()
                + ", " + n.getPrice() + "BYN");

        stream.forEach(action);
    }

    public static void PrintAllPetsColor(ArrayList<PetShop> AL, String color) {
        Stream<PetShop> stream = AL.stream();
        Predicate<PetShop> predicate = (petShop) -> petShop.getColor().equals(color);
        Stream<PetShop> filterStream = stream.filter(predicate);
        Consumer<PetShop> action = (n) -> System.out.println(
                n.getNickname()
                        + ", " + n.getNickname()
                        + ", " + n.getName()
                        + ", " + n.getColor()
                        + ", " + n.getAge()
                        + ", " + n.getPrice() + " BYN");

        filterStream.forEach(action);
    }

    public static void PrintAllPetsPrice(ArrayList<PetShop> AL, double price) {
        Stream<PetShop> stream = AL.stream();
        Predicate<PetShop> predicate = (petShop) -> petShop.getPrice() > price;

        Stream<PetShop> filterStream = stream.filter(predicate);
        Consumer<PetShop> action = (n) -> System.out.println(
                n.getNickname()
                        + ", " + n.getName()
                        + ", " + n.getColor()
                        + ", " + n.getAge()
                        + ", " + n.getPrice() + " BYN");

        filterStream.forEach(action);
    }

    public static void PrintAllPetsAge(ArrayList<PetShop> AL, int age1, int age2) {
        Predicate<PetShop> predicate = (petShop) -> (petShop.getAge() >= age1) && (petShop.getAge() <= age2);
        Stream<PetShop> stream = AL.stream().filter(predicate);
        Consumer<PetShop> action;
        action = (petShop) -> System.out.println(
                petShop.getNickname()
                        + ", " + petShop.getName()
                        + ", " + petShop.getColor()
                        + ", " + petShop.getAge()
                        + ", " + petShop.getPrice() + " BYN");

        stream.forEach(action);
    }

    public static void PrintPetsSortedByPrice(ArrayList<PetShop> AL) {
        Comparator<PetShop> comparator;
        comparator = (petShop1, petShop2) -> (int) (petShop2.getPrice() - petShop1.getPrice());
        Stream<PetShop> sortedStream = AL.stream().sorted(comparator);
        Consumer<PetShop> action = (petShop) -> System.out.println(
                petShop.getNickname()
                        + ", " + petShop.getName()
                        + ", " + petShop.getColor()
                        + ", " + petShop.getAge()
                        + ", " + petShop.getPrice() + " BYN");

        sortedStream.forEach(action);
    }
}
