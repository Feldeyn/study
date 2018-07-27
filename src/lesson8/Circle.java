package lesson8;

public class Circle extends Shape {
    private int rad;

    public Circle(double x, double y, String color, int rad) {
        super(x, y, color);
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void draw() {
        System.out.println("Рисую круг с центром в " + getX() + " " + getY() + ", радиусом " + getRad());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return rad == circle.rad;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + rad;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                "} " + super.toString();
    }
}
