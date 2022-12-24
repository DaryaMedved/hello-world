package by.itacademy.hw5;

public class Person {
    String fullName;
    int age;
    public void moveDasha(){
        System.out.println("Dasha двигается" );
    }
    public void talkDasha(){
        System.out.println("Dasha говорит");
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public Person(){
    }
    public static void main(String[] args){
        Person dasha = new Person("Dasha", 26);
        dasha.fullName = "Dasha";
        dasha.age = 26;

        dasha.moveDasha();
        dasha.talkDasha();

        System.out.println(dasha.fullName + " " + dasha.age);
    }
}
