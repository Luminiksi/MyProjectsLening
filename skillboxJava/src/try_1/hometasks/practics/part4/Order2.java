package try_1.hometasks.practics.part4;

public class Order2 {
    private int count = 0;
    private int totalCost = 0;

    public void addProducts(int productsCount, int cost) {
        count = count + productsCount;
        totalCost += cost;
    }

    public int getProductsCount() {
        return count;
    }

    public int getTotalCost() {
        return totalCost;
    }

}
