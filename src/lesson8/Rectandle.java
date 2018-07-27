package lesson8;

public class Rectandle extends Shape {
    private double z;

    public Rectandle(double x, double y, String color, double z) {
        super(x, y, color);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void draw() {
        System.out.println("Рисую треугольник по точкам " + getX() + " " + getY() + " " + getZ());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectandle rectandle = (Rectandle) o;

        return Double.compare(rectandle.z, z) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rectandle{" +
                "z=" + z +
                "} " + super.toString();
    }
}
