package by.itacademy.hw7.FlowerB;

import by.itacademy.hw7.FlowerB.Flower;
import by.itacademy.hw7.FlowerB.FlowerMarket;

public class Lily extends Flower {
    private static int count;

    public Lily() {
        super.setName("Лилия");
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void printSoldFlowerInfo() {
        System.out.printf("Количество проданных лилий - %d шт\n\n", getCount());
    }

    @Override
    public double getCost() {
        return FlowerMarket.Flowers.LILY.getPrice();
    }
}