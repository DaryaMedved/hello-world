package by.itacademy.hw7.task4;

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