package lesson16;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Float>sup=()->(float)Math.random()*25;
        float f=sup.get();
        System.out.println(f);
    }
}
