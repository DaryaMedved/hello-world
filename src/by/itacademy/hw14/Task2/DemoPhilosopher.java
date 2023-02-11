package by.itacademy.hw14.Task2;

public class DemoPhilosopher {
    public static void main(String[] args) {

        Fork[] forks = new Fork[]{new Fork(), new Fork(), new Fork(), new Fork(), new Fork()};

        Thread t1 = new Thread(new Philosopher(forks[3], forks[0]));
        t1.setName("Зенон(~ 490-430гг. до н.э.)");
        Thread t2 = new Thread(new Philosopher(forks[0], forks[1]));
        t2.setName("Фридрих Ницше(1844-1900гг.)");
        Thread t3 = new Thread(new Philosopher(forks[2], forks[1]));
        t3.setName("Будда(~ 576-488гг. до н.э.)");
        Thread t4 = new Thread(new Philosopher(forks[2], forks[3]));
        t4.setName("Иммануил Кант(1724-1804гг.)");
        Thread t5 = new Thread(new Philosopher(forks[4], forks[3]));
        t5.setName("Рене Декарт(1596-1650гг.)");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
