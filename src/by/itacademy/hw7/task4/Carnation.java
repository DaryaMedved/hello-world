package by.itacademy.hw7.task4;


public class Carnation extends Flower {
    private static int count;

    public Carnation() {
        super.setName("Гвоздика");
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void printSoldFlowerInfo() {
        System.out.printf("Количество проданных гвоздик - %d шт\n\n", getCount());
    }

    @Override
    public double getCost() {
        return FlowerMarket.Flowers.CARNATION.getPrice();
    }
}