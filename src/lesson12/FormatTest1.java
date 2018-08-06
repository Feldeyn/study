package lesson12;

import java.util.Formatter;

public class FormatTest1 {
    public static void main(String[] args) {
        format1("Тищенко", 4, "ДМ");
    }

    public static void format1(String a, int b, String c) {
        System.out.printf("Студент %15s получил %3d по предмету %10s", a, b, c);
    }
}
