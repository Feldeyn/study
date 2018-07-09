package lesson5;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        int[] masiv = new int[10];
        int k = 1;
        for (int i = 0; i < 10; i++) {
            masiv[i] = k;
            k++;
        }
        System.out.println(Arrays.toString(masiv));
        System.arraycopy(masiv, 0, masiv, 1, 9);
        System.out.println(Arrays.toString(masiv));
    }
}
