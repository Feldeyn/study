package lesson8;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5, 10, "Черный", 1);
        shapes[1] = new Rectandle(7, 18, "Белый", 3);
        shapes[2] = new Circle(5, 20, "Черный", 1);
        shapes[3] = new Rectandle(7, 18, "Белый", 3);
        for (Shape s : shapes) {
            s.draw();
        }
        System.out.println(shapes[0].equals(shapes[2]));
        System.out.println((shapes[3].equals(shapes[1])));
        System.out.println(shapes[2]);
        System.out.println(shapes[3]);
    }
}
