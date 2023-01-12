package by.itacademy.hw7.FlowerB;

import by.itacademy.hw7.FlowerB.Flower;
import by.itacademy.hw7.FlowerB.FlowerMarket;

public class Aster extends Flower {
    private static int count;

    public Aster() {
        super.setName("Астра");
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void printSoldFlowerInfo() {
        System.out.printf("Количество проданных астр - %d шт\n\n", getCount());
    }

    @Override
    public double getCost() {
        return FlowerMarket.Flowers.ASTER.getPrice();
    }
}