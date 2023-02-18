package by.itacademy.hw7.task1;

public class Aspirant extends Student {
    private final String scienceWork;

    public Aspirant(String firstName, String lastName,
                    String groupNumber, String nameGroup,
                    int avgMark, String scienceWork) {
        super(firstName, lastName, groupNumber, nameGroup, avgMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public double getScholarship() {
        return avgMark == 5 ? 200 : 180;
    }

    public static void main(String[] args) {
        Student student = new Student("Михаил", "Михайлов",
                "Group 6", "Doctor", 5);
        Aspirant aspirant1 = new Aspirant("Ярослав", "Иванов",
                "Grope 9", "Music", 4, "scienceWork");
        Aspirant aspirant2 = new Aspirant("Илья", "Александров", "Group 3",
                "Sport", 3, "scienceWork1");

        Student[] students = new Student[]{student, aspirant1, aspirant2};
        for (Student s : students) {
            System.out.println(s.lastName + " " + s.getScholarship());
        }
    }

    public String getScienceWork() {
        return scienceWork;
    }
}
