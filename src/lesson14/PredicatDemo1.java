package lesson14;

import java.util.function.Predicate;

public class PredicatDemo1 {
    public static void main(String[] args) {
        Predicate<String> pr=a->a.startsWith("J");
        Predicate<String> pr1 =b->b.startsWith("N");
        Predicate<String> pr2=c->c.endsWith("A");
        Predicate<String> pr3=d->d!=null;
        Predicate<String> predicate=pr.or(pr1);
        Predicate<String> predicate1=predicate.and(pr2);
        Predicate<String> predicate2=predicate1.and(pr3);
        System.out.println(predicate2.test("NksdfkjA"));
        System.out.println(predicate2.test("NksdfkjR"));
    }
}
