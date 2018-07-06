package lesson5;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        int[] proverkaDeBug = {2, 65, 89, 1, 95, 14};
        for (int i = 0; i < proverkaDeBug.length; i++) {
            for (int j = proverkaDeBug.length - 1; j > i; j--) {
                if (proverkaDeBug[j - 1] > proverkaDeBug[j]) {
                    int tmp = proverkaDeBug[j - 1];
                    proverkaDeBug[j-1] = proverkaDeBug[j];
                    proverkaDeBug[j] = tmp;
                    System.out.println(Arrays.toString(proverkaDeBug));
                }
            }
        }
    }
}

