package lesson5;

public class Task19 {
    public static void main(String[] args) {
        int[] sortvibor = {23, 45, 12, 6, 12, 43};
        for (int i = 0; i < sortvibor.length; i++) {
            int min = sortvibor[i];
            int pos = i;
            for (int j = i + 1; j < sortvibor.length; j++) {
                if (min > sortvibor[j]) {
                    pos = j;
                    min = sortvibor[j];
                }
            }
            sortvibor[pos] = sortvibor[i];
            sortvibor[i] = min;
        }
    }
}
