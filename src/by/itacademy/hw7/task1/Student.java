package by.itacademy.hw7.task1;

public class Student {
    public String firstName;
    public String lastName;
    public String groupNumber;
    public String nameGroup;
    public int avgMark;

    public Student(String firstName, String lastName, String groupNumber, String nameGroup, int avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.nameGroup = nameGroup;
        this.avgMark = avgMark;

        System.out.println(firstName + " " + lastName + ", "
                + groupNumber + ", " + nameGroup + " " + avgMark
                + ", " + "стипендия:" + " " + getScholarship());
    }

    public double getScholarship() {
        return avgMark == 5 ? 100 : 80;
    }
}
