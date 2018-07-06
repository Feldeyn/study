package lesson3;

public class Task2 {
    public static void main(String[] args) {
        byte x = 5;
        testByte(x);
        short y = 8;
        testShort(y);
        int z = 10;
        testInt(z);
        long q = 34;
        testLong(q);
        double w = 25.5;
        testDouble(w);
        float r = 12.145f;
        testFloat(r);
        char c = 45;
        testChar(c);
    }

    static void testByte(byte x) {
        short y = x;
        int z = x;
        long q = x;
        double w = x;
        float r = x;
        char c = (char) x;
    }

    static void testShort(short y) {
        byte x = (byte) y;
        int z = y;
        long q = y;
        double w = y;
        float r = y;
        char c = (char) y;
    }

    static void testInt(int z) {
        byte x = (byte) z;
        short y = (short) z;
        long q = z;
        double w = z;
        float r = z;
        char c = (char) z;
    }

    static void testLong(long q) {
        byte x = (byte) q;
        short y = (short) q;
        int z = (int) q;
        double w = q;
        float r = q;
        char c = (char) q;
    }

    static void testDouble(double w) {
        byte x = (byte) w;
        short y = (short) w;
        int z = (int) w;
        long q = (long) w;
        float r = (float) w;
        char c = (char) w;
        System.out.println(c);
    }

    static void testFloat(float r) {
        byte x = (byte) r;
        short y = (short) r;
        int z = (int) r;
        long q = (long) r;
        double w = r;
        char c = (char) r;
    }

    static void testChar(char c) {
        byte x = (byte) c;
        short y = (short) c;
        int z = c;
        long q = c;
        double w = c;
        float r = c;
    }
}
