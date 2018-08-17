package lesson14;

import java.util.function.Predicate;

public class PredicatDemo {
    public static void main(String[] args) {
        Predicate<String> pred=str->str!=null;
        Predicate<String> pred1=b->!b.isEmpty();
        Predicate<String>pred2=pred.and(pred1);
        String a=null;
        String c="";
        System.out.println(pred2.test(a));
        System.out.println(pred2.test("sdjfh"));

        System.out.println(pred2.test("asd"));
        System.out.println(pred2.test(c));
    }
}
