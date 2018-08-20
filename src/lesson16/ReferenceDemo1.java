package lesson16;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ReferenceDemo1 {
    public static void main(String[] args) {
        UnaryOperator<String> newString = String:: new;
        System.out.println(newString.apply("ruty"));
    }
}
