package lesson9;

import lesson9.task4.Apple;
import lesson9.task4.Apricot;
import lesson9.task4.Fruit;
import lesson9.task4.Pear;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(3);
        Fruit apple2 = new Apple(6);
        Fruit apricot1 = new Apricot(26);
        Fruit pear1 = new Pear(25);
        Fruit pear2 = new Pear(67.1);

        Fruit[] fruits = {apple1, apple2, apricot1, pear1, pear2};
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getValue());
        }
        System.out.println("Стоимость всех проданных фруктов - " + Fruit.getValue(fruits));
        System.out.println("Стоимость всех проданных яблок - " + Fruit.getValue(apple1, apple2));
        System.out.println("Стоимость всех проданных персиков - " + Fruit.getValue(pear1, pear2));
    }
}
