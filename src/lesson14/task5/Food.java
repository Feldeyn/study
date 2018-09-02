package lesson14.task5;

public class Food {
    public void prepare(Cookable c) {
        c.cook("я готовлю");
    }

    public static void main(String[] args) {
        Food food1 = new Food();
        food1.prepare(System.out::print);
    }
}
