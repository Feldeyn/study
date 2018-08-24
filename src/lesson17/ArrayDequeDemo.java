package lesson17;

import lesson14.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<HeavyBox> box1 = new ArrayDeque<>();
        box1.offer(new HeavyBox(1, 2, 3, 4));
        box1.offer(new HeavyBox(5, 12, 13, 14));
        box1.offer(new HeavyBox(25, 22, 23, 24));
        box1.offerFirst(new HeavyBox(115, 122, 123, 124));
        while (!box1.isEmpty()) {
            System.out.println(box1.poll().getWeight());
        }
    }
}
