package by.itacademy.hw8.FootwereStore;

import by.itacademy.hw8.StoreDemoSizes.Sizes;

public class Sneakers extends Footwear implements MaleFootwear {
    public Sneakers(Sizes size, String color) {super(size, color);}

    public Sneakers(Sizes size, String color, double cost) {super(size, color, cost);}

    @Override
    public String toString() {
        return "Кроссовки{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " BYN" +
                ", цвет = " + getColor() +
                "}";
    }
}
