package lesson12;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder k = new StringBuilder("I love object OrienTed programming!!!");
        String s = String.valueOf(k);
        zamena(k,s);
    }

    public static void zamena(StringBuilder z, String s) {
        int k = s.toLowerCase().indexOf("object oriented programming");
        z.replace(k, (k + 27),"OOP");
        System.out.println(z);
        System.out.println(s);
    }
}
