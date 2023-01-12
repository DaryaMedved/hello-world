package by.itacademy.hw7.FlowerB;

import by.itacademy.hw7.FlowerB.Flower;
import by.itacademy.hw7.FlowerB.FlowerMarket;

public class Herbera extends Flower {
    private static int count;

    public Herbera() {
        super.setName("Гербера");
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void printSoldFlowerInfo() {
        System.out.printf("Количество проданных гербер - %d шт\n\n", getCount());
    }

    @Override
    public double getCost() {
        return FlowerMarket.Flowers.HERBERA.getPrice();
    }
}