package lesson17;

import lesson14.HeavyBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeavyBoxIterator {
    public static void main(String[] args) {
        List<HeavyBox> box1 = new ArrayList<>();
        box1.add(new HeavyBox(15, 15, 15, 15));
        box1.add(new HeavyBox(20, 20, 20, 320));
        box1.add(new HeavyBox(10, 10, 10, 10));
        box1.add(new HeavyBox(10, 10, 10, 800));
        List<HeavyBox> result = boxVeryHeavy(box1);
        System.out.println(result);
    }

    public static List<HeavyBox> boxVeryHeavy(List<HeavyBox> box2) {
        List<HeavyBox> boxHeavy = new ArrayList<>();
        Iterator<HeavyBox> veryHeavyBox = box2.iterator();
        while (veryHeavyBox.hasNext()) {
            HeavyBox element = veryHeavyBox.next();
            if (element.getWeight() > 300) {
                boxHeavy.add(element);
                veryHeavyBox.remove();
            }
        }
        return boxHeavy;
    }

}
