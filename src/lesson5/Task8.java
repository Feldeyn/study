package lesson5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner girlanda = new Scanner(System.in);
        System.out.println("Введите число для гирлянды");
        int x = girlanda.nextInt();
        System.out.println("ВВедите номер операции (1-4)");
        int y = girlanda.nextInt();
        System.out.println("Начальный вид гирлянды - " + Integer.toBinaryString(x));
        switch (y) {
            case 1:
                x = ~x;
                System.out.println(Integer.toBinaryString(x));
                break;
            case 2:
                x = x >> 1;
                System.out.println(Integer.toBinaryString(x));
                break;
            case 3:
                x = x << 1;
                System.out.println(Integer.toBinaryString(x));
                break;
            case 4:
                x &= 1;
                System.out.println(Integer.toBinaryString(x));
                break;
        }
    }
}