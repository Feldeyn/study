package lesson8;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5, 10, "Черный", 1);
        shapes[1] = new Rectandle(7, 18, "Белый", 3);
        for (Shape s : shapes) {
            s.draw();
        }
    }
}
