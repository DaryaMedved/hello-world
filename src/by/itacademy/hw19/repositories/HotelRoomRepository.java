package by.itacademy.hw19.repositories;

import by.itacademy.hw19.HotelRoom;

import java.util.ArrayList;
import java.util.List;

public class HotelRoomRepository {
    private static HotelRoomRepository instance;
    private final List<HotelRoom> rooms = new ArrayList<>();

}