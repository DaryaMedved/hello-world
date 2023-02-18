package by.itacademy.hw7.task4;

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
