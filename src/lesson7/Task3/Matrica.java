package lesson7.Task3;

import java.util.Arrays;
import java.util.Scanner;

class Matrica {
    private int[][] dvumer = {
            {1, 2, 3},
            {4, 5, 6},
    };

    public void setDvumer(int[][] dvumer) {
        this.dvumer[2][3] = dvumer[2][3];

    }

    public int getDvumer() {
        return dvumer[2][3];
    }

    void slogenie() {
        long[][] umnogeniemas = new long[2][3];
        int[][] vtoroydvumer = new int[2][3];
        int[][] summamas = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                vtoroydvumer[i][j] = (int) (Math.random() * 10);
                summamas[i][j] = this.dvumer[i][j] + vtoroydvumer[i][j];
                umnogeniemas[i][j] = (long) (this.dvumer[i][j] * vtoroydvumer[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(vtoroydvumer));
        System.out.println(Arrays.deepToString(summamas));
        System.out.println(Arrays.deepToString(umnogeniemas));
    }

    void umnogenie() {
        int[][] umnogenmas = new int[2][3];
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите целое число для умножения матрицы");
        int k = chislo.nextInt();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                umnogenmas[i][j] = this.dvumer[i][j] * k;
            }
        }
        System.out.println(Arrays.deepToString(umnogenmas));
    }
    void pechat() {
        System.out.println(Arrays.deepToString(dvumer));
    }
}
