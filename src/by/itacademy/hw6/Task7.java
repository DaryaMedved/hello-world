package by.itacademy.hw6;
public class Task7 {
    public static void main(String[] args) {
        Double double1 = (double) 6;
        Double double2 = new Double("9");
        Double double3 = (double) 8;
        Double double4 = Double.valueOf("66");

        String s = "56.98";
        double d = Double.parseDouble(s);

        double a = 56.98;
        int b = (int)a;
        double c = 56.98;
        byte e = (byte)c;
        double h = 56.98;
        long l = (long)h;
        double o = 56.98;
        char n = (char)o;
        double m = 56.98;
        short z = (short)m;

        double  i = 3.14;
        String str = Double.toString(i);

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);

        System.out.println(d);

        System.out.println(b);
        System.out.println(e);
        System.out.println(l);
        System.out.println(n);
        System.out.println(z);

        System.out.println(str);
    }
    public static double toDouble(String s) {
        return Double.parseDouble(s);
    }
    public static String toString(Double i) {
        return Double.toString(i);
    }
}
