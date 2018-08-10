package lesson13;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate birzday = LocalDate.of(1983, Month.MARCH, 12);
        LocalDate segodna = LocalDate.now();
        printBirzday(birzday);
        sravnenie(birzday, segodna);
    }

    public static void printBirzday(LocalDate d) {
        System.out.println(d.getYear());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfYear());
        System.out.println(d.getMonth());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfWeek());
    }

    public static void sravnenie(LocalDate b, LocalDate s) {
        System.out.println(b.isAfter(s));
        boolean a;
        System.out.println(a=b.isBefore(s));
    }
}
