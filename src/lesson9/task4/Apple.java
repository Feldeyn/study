package lesson9.task4;

public class Apple extends Fruit {
    public static final double PRICE_PER_KG = 30;

    public Apple(double weight) {
        super(weight);
    }

    public double getValue() {
        return getWeight() * PRICE_PER_KG;
    }
}
