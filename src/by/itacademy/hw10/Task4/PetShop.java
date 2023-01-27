package by.itacademy.hw10.Task4;

class PetShop {
    private final String nickname;
    private final String name;
    private final int age;
    private final String color;

    private final double price;

    public PetShop(String nickname, String _name, int _year, String _color, double _price) {
        this.nickname = nickname;name = _name;age = _year;color = _color;price = _price;
    }

    String getNickname() {
        return nickname;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getColor() {
        return color;
    }

    double getPrice() {
        return price;
    }
}
