package lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner chisla = new Scanner(System.in);
        System.out.println("Введите число");
        if (chisla.hasNextInt()) {
            int a, b;
            a = chisla.nextInt();
            b = chisla.nextInt();
            System.out.println(a + b);
        } else {
            System.out.println("Введено неправильное число");
        }
    }

}

