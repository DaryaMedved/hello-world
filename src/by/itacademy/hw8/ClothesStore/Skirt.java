package by.itacademy.hw8.ClothesStore;

import by.itacademy.hw8.StoreDemoSizes.Sizes;

public class Skirt extends Clothes implements IFemaleClothes {
    public Skirt(Sizes size, String color) {
        super(size, color);
    }

    public Skirt(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Юбка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " BYN" +
                ", цвет = " + getColor() +
                "}";
    }
}