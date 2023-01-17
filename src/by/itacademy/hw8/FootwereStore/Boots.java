package by.itacademy.hw8.FootwereStore;

import by.itacademy.hw8.StoreDemoSizes.Sizes;

public class Boots extends Footwear implements FemaleFootwear {
    public Boots(Sizes size, String color) {
        super(size, color);
    }

    public Boots(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Сапоги{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " BYN " +
                ", цвет = " + getColor() +
                "}";
    }
}
