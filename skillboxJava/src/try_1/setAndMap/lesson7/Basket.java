package try_1.setAndMap.lesson7;

import java.util.HashMap;
import java.util.Map;

public class Basket {
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

    @Override
    /*public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Product product : products.keySet()) {
            builder.append(product);
            builder.append(" - ");
            builder.append(products.get(product));
            builder.append("\n");
        }
        return builder.toString();
    }*/
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            builder.append(entry.getKey());
            builder.append(" - ");
            builder.append(entry.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
