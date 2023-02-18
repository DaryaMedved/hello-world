package by.itacademy.hw7.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class FruitBasket {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        for (int i = 0; i < 29; i++) {
            fruits.add(getRandomFruit());
        }
        printInfo(fruits);
    }

    public static void printInfo(List<Fruit> fruits) {
        System.out.println("Продано фруктов:");
        System.out.printf("Яблок - %d шт. (%.2f кг), - %.2f BYN\n", Apple.getCount(), Apple.getTotalWeight(), Apple.getTotalCost());
        System.out.printf("Груш - %d шт. (%.2f кг), - %.2f BYN\n", Pear.getCount(), Pear.getTotalWeight(), Pear.getTotalCost());
        System.out.printf("Абрикосов - %d шт. (%.2f кг), - %.2f BYN\n", Apricot.getCount(), Apricot.getTotalWeight(), Apricot.getTotalCost());
        System.out.printf("Общая сумма: %.2f BYN", getTotalCost(fruits));
    }

    public static double getTotalCost(List<Fruit> fruits) {
        double total = 0.0;
        for (Fruit fruit : fruits) {
            total += fruit.getCost();
        }
        return total;
    }

    public static Fruit getRandomFruit() {
        switch (new Random().nextInt(3)) {
            case 0:
                return new Apple(8);
            case 1:
                return new Pear(12);
            default:
                return new Apricot(9);
        }
    }
}