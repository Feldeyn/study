package lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner chisla = new Scanner(System.in);
        System.out.println("Введите первое число");
        if (chisla.hasNextInt()) {
            int a;
            a = chisla.nextInt();
        } else {
            System.out.println("Введено неправильное число");
        }
        System.out.println("Введите первое число");
        if (chisla.hasNextInt()) {
            int b;
            b = chisla.nextInt();
        } else {
            System.out.println("Введено неправильное число");
        }
      //  System.out.println(a + b);

    }
}

