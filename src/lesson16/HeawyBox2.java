package lesson16;

import lesson14.HeavyBox;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeawyBox2 {

    public static void main(String[] args) {
        SortedSet<HeavyBox> heavy = new TreeSet<>();
        heavy.add(new HeavyBox(15, 15, 15, 15));
        heavy.add(new HeavyBox(20, 20, 20, 20));
        heavy.add(new HeavyBox(10, 10, 10, 10));
        for (HeavyBox h : heavy) {
            System.out.println(h.getWeight());
        }
    }


}
