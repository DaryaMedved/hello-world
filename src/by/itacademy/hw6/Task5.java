package by.itacademy.hw6;
public class Task5 {
    public static void main(String[] args) {
        String Str = new String("Object-oriented programming is a programming"
                + " language model organized around objects rather than \"actions\" and "
                + "data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.\"\n");

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.replace("Object-oriented programming","OOP"));

    }
}



