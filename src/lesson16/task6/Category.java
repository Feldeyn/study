package lesson16.task6;

import java.util.Set;
import java.util.TreeSet;

public class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ProductComparatorName pc = new ProductComparatorName();
        Set<Product> prod = new TreeSet<>(pc);
        Product p1 = new Product("Sony", 3000.23, 1);
        Product p2 = new Product("LG", 2700.52, 2);
        Product p3 = new Product("Lenovo", 2100.52, 3);
        prod.add(p1);
        prod.add(p2);
        prod.add(p3);
        print(prod);
    }

    public static void print(Set<Product> product) {
        for (Product p : product) {
            System.out.println(p.getName());
        }
    }
}