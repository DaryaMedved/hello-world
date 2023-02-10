package by.itacademy.hw12.Task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Joshua", "Red", 66600, 23),
                new Person("Alfredo", "Green", 719600, 24),
                new Person("Mike", "Black", 300987.5, 29),
                new Person("Corey", "Yellow", 999100.77, 34),
                new Person("Lion", "Pink", 62001, 39),
                new Person("Denzel", "Blue", 387801, 30),
                new Person("Willie", "Brown", 42361.4, 22)};


        List<Person> list = Arrays.asList(people);


        System.out.println("Complete Person list:");
        list.forEach(System.out::println);


        Function<Person, String> byFirstName = Person::getFirstName;
        Function<Person, String> byLastName = Person::getLastName;


        Comparator<Person> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);


        System.out.printf(
                "%nPersons in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }
}

class Person {
    private String firstName;
    private String lastName;
    private double salary;
    private int age;

    public Person(String firstName, String lastName,
                  double salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }


    @Override
    public String toString() {
        return String.format("%-8s %-8s %8.2f   %s", getFirstName(), getLastName(), getSalary(), getAge());
    }
}
