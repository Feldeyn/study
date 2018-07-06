package lesson5;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int k = 0;
        int[] pusurok = {34, 12, 56, 23, 7};
        for (int i = 0; i < pusurok.length - 1; i++) {
            for (int j = 0; j < pusurok.length - (1 + i); j++) {
                if (pusurok[j + 1] > pusurok[j]) {
                    int tmp = pusurok[j];
                    pusurok[j] = pusurok[j + 1];
                    pusurok[j + 1] = tmp;
                    System.out.println(Arrays.toString(pusurok));
                    k = 0;
                } else {
                    k = k + 1;
                }
            }
            if (k > (pusurok.length - i)) {
                break;
            }
        }
    }
}
