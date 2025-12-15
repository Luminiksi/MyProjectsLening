package main.try_2.setAndMap.Lesson_7;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    // второе значение - количество
    private HashMap<Product, Integer> products;

    public Basket() {
        this.products = new HashMap<>();
    }

    public void add(Product product, int count) {
        if (!products.containsKey(product)) {
            products.put(product, 0);
        }
        products.put(product, products.get(product) + count);
    }

    public void add(Product product) {
        add(product, 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        /*for (Product product : products.keySet()) {
            sb.append(product);
            sb.append(" - ");
            sb.append(products.get(product));
            sb.append("\n");
        }*/
        for (Map.Entry<Product, Integer> entry: products.entrySet()) {
            Product product = entry.getKey();
            sb.append(product);
            sb.append(" - ");
            sb.append(entry.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }
}
