package lesson11;

public class StringDemo1 {
    public static void main(String[] args) {
        String a = "I like Java!!!";
        posledniy(a);
        poisk(a);
    }

    public static void posledniy(String a) {
        char a1 = a.charAt(a.length() - 1);
        System.out.println(a1);
    }

    public static void poisk(String a) {
        System.out.println(a.indexOf("Java"));
        System.out.println(a.replace('a', 'o'));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.substring(7,11));
    }
}
