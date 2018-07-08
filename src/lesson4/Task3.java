package lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Double a, b, c;
        a = vvod();
        b = vvod();
        c = vvod();
        double summa=(a+b+c);
        System.out.println("Среднее значение= " + summa/3);
    }

    public static double vvod() {
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите число");
        String x = chislo.nextLine();
        double a=Double.parseDouble(x);
        return a;
    }
}
