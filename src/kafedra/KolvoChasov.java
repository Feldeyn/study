package kafedra;

import java.util.Scanner;

public class KolvoChasov {
    public static double kolvochasov() {
        Scanner kc = new Scanner(System.in);
        double kolvochasov = 1;
        System.out.println("Введите количество часов - ");
        if (kc.hasNextDouble()) {
            kolvochasov = kc.nextDouble();
        } else {
            System.out.println("Введено неправильное число");
        }
        return kolvochasov;
    }
}