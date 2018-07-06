package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (chislo.hasNextInt()) {
            int a = chislo.nextInt();
            if (a % 2 == 1) {
                System.out.println("Число не четное");
            } else {
                System.out.println("Число четное");
            }
        } else {
            System.out.println("Введено не целое число");
        }
    }
}
