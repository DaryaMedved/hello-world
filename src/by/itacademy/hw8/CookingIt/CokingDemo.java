package by.itacademy.hw8.CookingIt;

public class CokingDemo {
    public static void main(String[] args) {
        Food food = new Food("tomato");
        Food food1 = new Food("salad");
        Food food2 = new Food("curdCheese");

        Dish dish = new Dish("greekSalad");
        Dish dish1 = new Dish("tomatoWithCheese");

        Cooking drink = () -> System.out.println("Preparation of cold drink ");
        Cooking[] cookings = {food, food1, food2, dish, dish1, drink};

        for (Cooking c : cookings) {
            c.cook();
        }
        Cooking.cookFood(cookings);
    }
}
