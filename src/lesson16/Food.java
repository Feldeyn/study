package lesson16;

public class Food {
    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(System.out::println);
    }

    public void prepare(Cookable c) {
        c.cook("1234");
    }
}
