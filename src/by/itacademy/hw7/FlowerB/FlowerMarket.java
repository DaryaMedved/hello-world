package by.itacademy.hw7.FlowerB;


public class FlowerMarket {
    public enum Flowers {
        ROSE("Роза", 90),
        ASTER("Астра", 66),
        HERBERA("Гербера", 86),
        LILY("Лилия", 99),
        CARNATION("Гвоздика", 77),
        TULIP("Тюльпан", 85);

        Flowers(String name, double price) {
            this.name = name;
            this.price = price;
        }

        private final double price;
        private final String name;
        public String getColor;
        public String setColor;

        public String getColor(String Color) {
            return getColor(name);
        }
        public String setColor(String Color){
            return setColor(name);

        }

        public double getPrice() {

            return price;
        }

        public String getName() {

            return name;
        }
    }

    public Flower getFlower(Flowers flower) {
        switch (flower) {
            case ROSE:
                return new Rose();
            case ASTER:
                return new Aster();
            case LILY:
                return new Lily();
            case HERBERA:
                return new Herbera();
            case TULIP:
                return new Tulip();
            case CARNATION:
                return new Carnation();
            default:
                return null;
        }
    }

    public Bouquet getBouquet(Flowers... flowers) {
        Flower[] flower = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            flower[i] = getFlower(flowers[i]);
        }
        return new Bouquet(flower);
    }
}

