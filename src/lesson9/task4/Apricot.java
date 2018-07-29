package lesson9.task4;

public class Apricot extends Fruit {
    public static final double PRICE_PER_KG = 20;

    public Apricot(double weight) {
        super(weight);
    }

    public double getValue() {
        return getWeight() * PRICE_PER_KG;
    }
}
