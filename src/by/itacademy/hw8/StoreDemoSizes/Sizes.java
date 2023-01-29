package by.itacademy.hw8.StoreDemoSizes;

public enum Sizes {
    XXS(36) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(38),
    S(40),
    M(42),
    L(44);


    Sizes(int euroSize) {
        EuroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }

    private final int EuroSize;
}
