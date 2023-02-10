package by.itacademy.hw5;

public class Phone {
    int number;
    int model;
    double weight;

    String name = "Masha";

    public void receiveCall() {
        String name = "Masha";
        System.out.println("Звонит" + name);
    }

    public void receiveCall(String name, int number){
        System.out.println("Звонит" + number);

    }
    public void getNumber() {
        System.out.println(number);
    }
    public void sendMessage(int number1, int number2) {
        System.out.println(number1 + number2);
    }
    public Phone(int number, int model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }
    public Phone(int number, int model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }
    public static void main(String[] args) {
        Phone apple = new Phone();
        apple.number = +8029555;
        apple.model = 11;
        apple.weight = 127;

        Phone nokia = new Phone();
        nokia.number = +80296666;
        nokia.model = 6;
        nokia.weight = 9;

        Phone samsung = new Phone();
        samsung.number = +80447777;
        samsung.model = 9;
        samsung.weight = 6;

        apple.receiveCall();
        nokia.receiveCall();
        samsung.receiveCall();

        apple.getNumber();
        nokia.getNumber();
        samsung.getNumber();

        System.out.println("apple: number=" + apple.number + " model=" + apple.model + " weight=" + apple.weight);
        System.out.println("nokia: number=" + nokia.number + " model=" + nokia.model + " weight=" + nokia.weight);
        System.out.println("samsung: number=" + samsung.number + " model=" + samsung.model + " weight=" + samsung.weight);


    }
}