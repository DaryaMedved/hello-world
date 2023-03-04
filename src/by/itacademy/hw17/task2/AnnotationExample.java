package by.itacademy.hw17.task2;

import java.lang.reflect.Field;
import java.util.Date;

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        System.out.println("Java Custom Annotation Example");
        System.out.println();

        User usr = new User();
        usr.setEmail("tom.long@example.com");
        usr.setName("Tom Long");
        usr.setId(666);
        usr.setCreated(new Date());

        for (Field field : usr.getClass().getDeclaredFields()) {
            AcademyInfo academyInfo = field.getAnnotation(AcademyInfo.class);
            System.out.println("field name: " + academyInfo.name());


            field.setAccessible(true);
            Object value = field.get(usr);
            System.out.println("field value: " + value);

            System.out.println("field type: " + academyInfo.type());
            System.out.println("is primary: " + academyInfo.isPrimaryKey());
            System.out.println();
        }
    }
}
