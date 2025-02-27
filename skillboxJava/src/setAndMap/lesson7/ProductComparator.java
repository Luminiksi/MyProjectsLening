package setAndMap.lesson7;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return -Integer.compare(p1.getPrice(), p2.getPrice());
    }
}
