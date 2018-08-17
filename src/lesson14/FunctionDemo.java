package lesson14;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Number> function = str -> {
            try {
                NumberFormat nf = NumberFormat.getInstance();
                return nf.parse(str);
            } catch (ParseException e) {
                return 0;
            }
        };
        System.out.println(function.apply("1"));
        System.out.println(function.apply("asdd"));
    }
}
