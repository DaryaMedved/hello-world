package by.itacademy.hw19;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HotelRoom {
    private int number;
    private BigDecimal price;
    private List<ServiceHotel> services = new ArrayList<>();
    private RoomState roomState = RoomState.SERVED;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void addService(ServiceHotel serviceHotel) {
        services.add(serviceHotel);
    }

    public void setRoomState(RoomState roomState) {
        this.roomState = roomState;
    }

    public RoomState getRoomState() {
        return roomState;
    }
}
