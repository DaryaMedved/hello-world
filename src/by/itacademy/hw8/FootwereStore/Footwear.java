package by.itacademy.hw8.FootwereStore;

import by.itacademy.hw8.ClothesStore.Clothes;
import by.itacademy.hw8.StoreDemoSizes.Sizes;

public abstract class Footwear {
    private Sizes size;
    private String color;
    private double cost;

    public Footwear(Sizes size, String color) {
        this.size = size;
        this.color = color;
    }
    public Footwear(Sizes size, String color, double cost) {
        this(size, color);
        this.cost = cost;
    }
    public Sizes getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes)) return false;

        Footwear footwear = (Footwear) o;

        if (Double.compare(footwear.cost, cost) != 0) return false;
        if (size != footwear.size) return false;
        return color.equals(footwear.color);
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = size.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }
}
