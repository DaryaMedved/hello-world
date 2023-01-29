package by.itacademy.hw8.ClothesStore;

import by.itacademy.hw8.StoreDemoSizes.Sizes;

public class TeeShirt extends Clothes implements IMaleClothes, IFemaleClothes {
    public TeeShirt(Sizes size, String color) {
        super(size, color);
    }

    public TeeShirt(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка{" +
                " размер = " + getSize() +
                ", цена = " + getCost() + " BYN" +
                ", цвет = " + getColor() +
                "}";
    }
}