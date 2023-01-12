package by.itacademy.hw7.FlowerB;

import by.itacademy.hw7.FlowerB.Flower;
import by.itacademy.hw7.FlowerB.FlowerMarket;

public class Rose extends Flower {
    private static int count;

    public Rose() {
        super.setName("Роза");
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void printSoldFlowerInfo() {
        System.out.printf("Количество проданных роз - %d шт\n\n", getCount());
    }

    @Override
    public double getCost() {
        return FlowerMarket.Flowers.ROSE.getPrice();
    }
}
