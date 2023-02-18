package by.itacademy.hw8.ClothesStore;

public interface IMaleClothes {
    default void dressMale() {
        System.out.println("Одеваем мужчину ");
    }
}

