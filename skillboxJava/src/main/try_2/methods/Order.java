package main.try_2.methods;

public class Order {
    private int count = 0;
    private int totalCost = 0;

    public void addProducts(int productsCount, int cost) {
        totalCost += cost;
        addProducts(productsCount);
    }

    public void addProducts(int productsCount) {
        count = count + productsCount;
    }

    public int getProductsCount() {
        return count;
    }

    public int getTotalCost() {
        return totalCost;
    }

}
