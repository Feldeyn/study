package lesson9;

import lesson9.task5.Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        Circle[] circles = {circle1, circle2};
        for (Circle c : circles) {
            c.knowArea();
            System.out.println("Периметр круга равен - " + c.knowPerimetr());
        }
    }
}
