package lesson9;

import lesson9.task4.Apple;
import lesson9.task4.Apricot;
import lesson9.task4.Fruit;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(3);
        Fruit apple2 = new Apple(6);
        Fruit apricot1 = new Apricot(26);
        Fruit[] fruits = {apple1, apple2, apricot1};
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getValue());
        }
        System.out.println("Стоимость всех проданных фруктов - " + Fruit.getValue(fruits));
        System.out.println("Стоимость всех проданных яблок - " + Fruit.getValue(apple1, apple2));
    }
}
