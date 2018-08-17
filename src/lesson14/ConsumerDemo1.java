package lesson14;

import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        Consumer<HeavyBox> consumer = box -> System.out.println("Отгрузли ящик весом " + box.weight);
        Consumer<HeavyBox> consumer1 = box1-> System.out.println("Отправляем ящик весом "+box1.weight);
        consumer.andThen(consumer1).accept(new HeavyBox(1, 2, 4, 3));

    }
}
