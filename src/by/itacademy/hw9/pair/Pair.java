package by.itacademy.hw9.pair;

import java.util.LinkedList;
import java.util.List;

public class Pair<T1, T2> {
    protected T1 first = null;
    protected T2 second = null;

    public Pair() {
    }

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> howManyCats = new Pair<>();

        howManyCats.setFirst("cats");
        howManyCats.setSecond(6);

        System.out.println("There are " + howManyCats.getSecond() + " "
                + howManyCats.getFirst() + " available.");
        System.out.println("w---------w");


        List<Pair<String, Integer>> inventory = new LinkedList<>();

        inventory.add(new Pair<>("snakes", 3));
        inventory.add(howManyCats);
        inventory.add(new Pair<>("wombats", 9));

        for (Pair<String, Integer> item : inventory) {
            System.out.println("There are " + item.getSecond() + " "
                    + item.getFirst() + " available.");
        }

        System.out.println("w---------w");

        List<InventoryItem> coolInventory = new LinkedList<>();
        InventoryItem someItem = new InventoryItem("goodies", 33);
        coolInventory.add(someItem);
        coolInventory.add(new InventoryItem("passion fruits", 66));

        InventoryItem changed = new InventoryItem(null, 0);
        changed.setName("compasses");
        changed.setQuantity(6);
        coolInventory.add(changed);

        for (InventoryItem item : coolInventory) {
            System.out.println("There are " + item.getQuantity() + " units of "
                    + item.getName() + " available.");
        }
    }

    public static class InventoryItem extends Pair<String, Integer> {

        public InventoryItem(String name, int quantity) {
            super.first = name;
            super.second = quantity;
        }

        public void setName(String itemName) {
            super.first = itemName;
        }

        public String getName() {
            return super.first;
        }

        public void setQuantity(int itemQuantity) {
            super.second = itemQuantity;
        }

        public int getQuantity() {
            return super.second;
        }
    }
}
