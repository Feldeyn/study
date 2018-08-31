package lesson17;

/**
 * Created by Student on 31.08.2018.
 */
public class Product {
    private String name;
    private double price;
    private int rate;

    public Product(String name, double price, int rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
