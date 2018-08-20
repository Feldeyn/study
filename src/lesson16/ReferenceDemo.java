package lesson16;

import java.util.function.IntFunction;

public class ReferenceDemo {
    public static void main(String[] args) {
        IntFunction<String> function = String::valueOf;
        System.out.println(function.apply(450));
    }
}
