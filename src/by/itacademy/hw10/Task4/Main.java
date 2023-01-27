package by.itacademy.hw10.Task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PetShop> AL = new ArrayList<>();
        AL.add(new PetShop("Tobi", "Black", 1, "Cat", 1880.0));
        AL.add(new PetShop("Wilfred", "Multicolored", 3, "Cat", 2050.0));
        AL.add(new PetShop("Logo", "Black", 1, "Dog", 11666.0));
        AL.add(new PetShop("Sony", "Braun", 2, "Snake", 345.0));
        AL.add(new PetShop("Anatoliy", "Blue", 1, "Parrot ", 102.0));
        AL.add(new PetShop("Fred", "Red", 1, "Parrot", 158.0));
        AL.add(new PetShop("Skunk", "White", 3, "Wombat", 258.0));

        StreamAPI.PrintAllPets(AL);
        System.out.println("---------------------------------");
        StreamAPI.PrintAllPetsColor(AL, "Multicolored");

        System.out.println("---------------------------------");
        StreamAPI.PrintAllPetsPrice(AL, 1900.0);

        System.out.println("---------------------------------");
        StreamAPI.PrintAllPetsAge(AL, 1, 3);

        System.out.println("---------------------------------");
        System.out.println("Sorting by descending sort");
        StreamAPI.PrintPetsSortedByPrice(AL);
    }
}

