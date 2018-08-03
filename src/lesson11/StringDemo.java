package lesson11;

public class StringDemo {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        proverca(s);
    }

    public static void proverca(String s) {
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I l"));
    }
}
