package try_1.hometasks.practics.part4;

public class Order1 {
    private int count = 0;

    public void addProducts(int productsCount) {
        count = count + productsCount;
    }

    public int getProductsCount() {
        return count;
    }
}
