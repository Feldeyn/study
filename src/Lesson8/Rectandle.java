package Lesson8;

public class Rectandle extends Shape {
    private double z;

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Rectandle(double x, double y, String color, double z) {
        super(x, y, color);
        this.z = z;
    }

    public void draw() {
        System.out.println("Рисую треугольник по точкам " + getX() + " " + getY() + " " + getZ());
    }
}
