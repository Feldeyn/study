package Lesson8;

public class Circle extends Shape {
    private int rad;

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public Circle(double x, double y, String color, int rad) {
        super(x, y, color);
        this.rad = rad;
    }

    public void draw() {
        System.out.println("Рисую круг с центром в " + getX() + " " + getY() + " " + getRad());
    }
}
