package lesson16.task6;

import java.util.Comparator;

public class ProductComparatorName implements Comparator <Product> {
    public int compare(Product o1, Product o2){
        return o1.getName().compareTo(o2.getName());
    }
}
