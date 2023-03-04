package by.itacademy.hw19;

import by.itacademy.hw19.services.HotelRoomService;

public class Menu {
    HotelRoomService service = new HotelRoomService();
    public static void main(String[] args) {
        new Menu().printMenu();
    }

    public void printMenu() {

        System.out.println("Главное меню\n" +
                "1: Заселение в номер\n" +
                "2: Выселение из номера\n" +
                "3: Смена статуса номера\n" +
                "4: Изменение стоимости номера\n" +
                "5: Добавление услуги\n" +
                "6: Добавление номера\n" +
                "7: Выход\n");

    }
}
