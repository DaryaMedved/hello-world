package by.itacademy.hw19.services;

import by.itacademy.hw19.HotelRoom;
import by.itacademy.hw19.RoomState;
import by.itacademy.hw19.repositories.HotelRoomRepository;

import java.util.HashMap;


public class HotelRoomService {
    HotelRoomRepository hotelRoomRepository = new HotelRoomRepository();
    HashMap<Integer, HotelRoom> rooms = new HashMap<>();

    public void addHotelRoom() {
        rooms.put(rooms.size() + 1, new HotelRoom());
    }

    public HotelRoom getHotelRoom(int num) {
        return rooms.get(num);
    }

    public void changeState(int num, RoomState state) {
        rooms.get(num).setRoomState(state);
    }

    public void moveOut(int num) {
        rooms.remove(num);
    }

}