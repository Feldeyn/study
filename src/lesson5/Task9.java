package lesson5;

public class Task9 {
    public static void main(String[] args) {
        long x = 1, f;
        f = (long) (Math.random() * 10);
        System.out.print("Факториал числа " + f);
        for (int i = 1; i < (f + 1); i++) {
            x = x * i;
        }
        System.out.println(" = " + x);
    }
}
