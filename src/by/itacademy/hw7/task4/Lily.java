package by.itacademy.hw7.task4;

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