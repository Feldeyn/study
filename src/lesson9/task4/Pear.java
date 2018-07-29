package lesson9.task4;

public class Pear extends Fruit {
    public static final double PRICE_PER_KG = 50;

    public Pear(double weight) {
        super(weight);
    }

    public double getValue() {
        return getWeight() * PRICE_PER_KG;
    }


}
