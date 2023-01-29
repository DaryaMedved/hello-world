package by.itacademy.hw8.ClothesStore;

import by.itacademy.hw8.StoreDemoSizes.Sizes;

public class Trousers extends Clothes implements IMaleClothes, IFemaleClothes {
    public Trousers(Sizes size, String color) {
        super(size, color);
    }

    public Trousers(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны{" +
                " размер = " + getSize() +
                ", цена = " + getCost() + " BYN" +
                ", цвет = " + getColor() +
                "}";
    }
}