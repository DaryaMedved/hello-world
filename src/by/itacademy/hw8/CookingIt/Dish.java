package by.itacademy.hw8.CookingIt;

import java.util.Objects;

public class Dish implements Cooking {

    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void cook() {
        System.out.println("Cooking dish " + getName());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                '}';
    }
}
