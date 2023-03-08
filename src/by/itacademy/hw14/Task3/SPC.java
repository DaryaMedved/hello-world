package by.itacademy.hw14.Task3;

import java.util.concurrent.Semaphore;

class Store {

    int item;
    static Semaphore semCon = new Semaphore(0);

    static Semaphore semProd = new Semaphore(1);


    void get() {

        try {

            semCon.acquire();

        } catch (InterruptedException e) {

            System.out.println("InterruptedException caught");

        }

        System.out.println("Consumer consumed item : " + item);

        semProd.release();

    }

    void put(int item) {

        try {

            semProd.acquire();

        } catch (InterruptedException e) {

            System.out.println("InterruptedException caught");

        }


        this.item = item;

        System.out.println("Producer produced item : " + item);

        semCon.release();

    }

}


class Producer implements Runnable {

    Store s;

    Producer(Store s) {

        this.s = s;

        new Thread(this, "Producer").start();

    }


    public void run() {

        for (int i = 0; i < 5; i++)

            s.put(i);

    }

}

class Consumer implements Runnable {

    Store s;

    Consumer(Store s) {

        this.s = s;

        new Thread(this, "Consumer").start();

    }


    public void run() {

        for (int i = 0; i < 5; i++)

            s.get();

    }

}

class Driver {

    public static void main(String[] args) {

        Store s = new Store();

        new Consumer(s);
        new Producer(s);

    }
}