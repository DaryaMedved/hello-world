package by.itacademy.hw19.services;

import by.itacademy.hw19.ServiceHotel;
import by.itacademy.hw19.repositories.ServiceRepository;

import java.util.ArrayList;
import java.util.List;


public class ServiceHotelService {

    private final ServiceRepository serviceRepository = ServiceRepository.getInstance();
    private final List<ServiceHotel> services = new ArrayList<>();

    public void addService(ServiceHotel serviceHotel) {
        services.add(serviceHotel);
    }

    public ServiceHotel getServiceHotel(Integer num) {
        return services.get(num);
    }
}