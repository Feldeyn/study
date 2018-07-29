package lesson9.task5;

public class Circle {
    public static final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void knowArea() {
        System.out.println("Площадь круга равна - " + PI * Math.pow(radius, 2));
    }

    public double knowPerimetr() {
        return 2 * PI * radius;
    }
}
