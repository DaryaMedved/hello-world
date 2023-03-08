package by.itacademy.hw17.task2;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class AnnotationExample {
    public static void main(String[] args) {
        BaseClass baseClass1 = new BaseClass();
///        baseClass1.showYear();
///       baseClass1.showYear1();
//        baseClass1.showYear2();

        Class<BaseClass> baseClass = BaseClass.class;
        //  Field[] baseClassFields = baseClass.getDeclaredFields();
        List<String> list = Arrays.asList("showYear", "showYear1", "showYear2");
        for (String name : list) {
            Method showYear;
            try {
                showYear = baseClass.getMethod(name);
                MyAnnotation annotation = showYear.getAnnotation(MyAnnotation.class);
                System.out.println("method: " + name);
                System.out.println("is annotated: " + (annotation != null));
                if (annotation != null) {
                    System.out.println("year = " + annotation.year());
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

///        Arrays.stream(baseClassFields).forEach(System.out::println);
///
///        MyAnnotation annotation = BaseClass.class.getAnnotation(MyAnnotation.class);
///        try {
//            System.out.println(annotation.year());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
    }
}

