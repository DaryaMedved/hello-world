package by.itacademy.hw18;

public class Demo {
    public static void main(String[] args) {
        CarAssemblyLine carAssemblyLine = new CarAssemblyLine();
        Car emptyCar = new Car();
        Car car = (Car) carAssemblyLine.assembleProduct(emptyCar);
        System.out.println(car.toString());
    }
}
