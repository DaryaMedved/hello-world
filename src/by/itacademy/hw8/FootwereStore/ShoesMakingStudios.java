package by.itacademy.hw8.FootwereStore;

public class ShoesMakingStudios {
    public void footwearMale(Footwear[] footwears) {
        System.out.println("Мужская обувь(в наличии):");
        for (Footwear footwear : footwears) {
            if (footwear instanceof MaleFootwear) {
                System.out.println(footwear);
            }
        }
    }

    public void footwearFemale(Footwear[] footwears) {
        System.out.println("Женская обувь(в наличии):");
        for (Footwear footwear : footwears) {
            if (footwear instanceof FemaleFootwear) {
                System.out.println(footwear);
            }
        }
    }
}

