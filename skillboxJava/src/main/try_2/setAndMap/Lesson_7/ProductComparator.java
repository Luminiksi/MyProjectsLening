package main.try_2.setAndMap.Lesson_7;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        //хотим в обратном порядке, поэтому ставим -
        return -Integer.compare(p1.getPrice(), p2.getPrice());
    }
}
