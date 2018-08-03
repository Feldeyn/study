package lesson11;

public class DoubleDemo {
    public static void main(String[] args) {
        Double d1 = 1.3;
        Double d2 = new Double("3.98");
        System.out.println(d1 +"    "+ d2);
        Double d3 = 3.56;
        Double d4 = Double.valueOf("954.8");
        System.out.println(d3 +"    "+ d4);
        double d5 = Double.parseDouble("978452.256485");
        System.out.println(d5);
        String s1 = Double.toString(24.6);
        System.out.println(s1);
        System.out.println(d1.longValue());
        System.out.println(d1.floatValue());
        System.out.println(d1.shortValue());
        System.out.println(d1.byteValue());
        System.out.println(Integer.MIN_VALUE);

    }
}
