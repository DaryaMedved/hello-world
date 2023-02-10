package by.itacademy.hw7.FlowerB;

public class Tulip extends Flower {
    String color;
    private static int count;

    public Tulip() {
        super.setName("Тюльпан");
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void printSoldFlowerInfo() {
        System.out.printf("Количество проданных тюльпанов - %d шт\n\n", getCount());
    }

    @Override
    public double getCost() {
        return FlowerMarket.Flowers.TULIP.getPrice();
    }
}
