package by.itacademy.hw8.StoreDemoSizes;

import by.itacademy.hw8.ClothesStore.*;
import by.itacademy.hw8.FootwereStore.Boots;
import by.itacademy.hw8.FootwereStore.Footwear;
import by.itacademy.hw8.FootwereStore.ShoesMakingStudios;
import by.itacademy.hw8.FootwereStore.Sneakers;

public class DemoClothesStore {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TeeShirt(Sizes.XS, "темно-серый", 35),
                new TeeShirt(Sizes.L, "черный", 25),
                new Trousers(Sizes.M, "голубой", 50),
                new Trousers(Sizes.XXS, "синий", 22),
                new Skirt(Sizes.S, "розовый", 40),
                new Skirt(Sizes.M, "красный", 52),
                new Tie(Sizes.L, "синий", 30),
                new Tie(Sizes.L, "красный", 28),
        };

        Footwear[] footwear = {
                new Boots(Sizes.S, "черный", 36),
                new Sneakers(Sizes.L, "белый", 66),
        };

        DressMakingStudio studio = new DressMakingStudio();
        studio.dressMale(clothes);
        System.out.println();
        studio.dressFemale(clothes);
        System.out.println();

        ShoesMakingStudios studios = new ShoesMakingStudios();
        studios.footwearMale(footwear);
        System.out.println();
        studios.footwearFemale(footwear);
    }
}