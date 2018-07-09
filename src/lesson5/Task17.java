package lesson5;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int[][] dvymern = {
                {12, 34, 23, 3, 54, 6, 54, 789},
                {45, 2345, 456, 56563, 345, 2345, 345, 34},
                {23, 65, 76, 236, 2, 1, 78, 5},
                {86, 74, 23, 85, 74, 854, 12, 48},
                {99, 897, 34, 123, 45, 78, 7534, 434235},
        };
        int min, max;
        int[][] dvumerMaxMin = new int[5][2];
        for (int k = 0; k < 5; k++) {
            min = dvymern[k][0];
            max = dvymern[k][0];
            for (int r = 1; r < 8; r++) {
                if (min > dvymern[k][r]) {
                    min = dvymern[k][r];
                }
                if (max < dvymern[k][r]) {
                    max = dvymern[k][r];
                }
            }
            dvumerMaxMin[k][0] = min;
            dvumerMaxMin[k][1] = max;
        }
        System.out.println(Arrays.deepToString(dvumerMaxMin));
    }
}
