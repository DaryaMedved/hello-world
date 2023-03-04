package by.itacademy.hw19.repositories;


public class ServiceRepository {
    private static ServiceRepository instance;

    public static ServiceRepository getInstance() {
        if (instance == null) {
            instance = new ServiceRepository();
        }
        return instance;
    }
}