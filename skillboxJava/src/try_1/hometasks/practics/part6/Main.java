package try_1.hometasks.practics.part6;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Молоко", 105);
        Product product2 = new Product("Сыр", 245);
        Product product3 = new Product("Хлеб", 54);

        System.out.println("count = " + Product.getCount());
        System.out.println("totalPrice = " + Product.getTotalPrice());
        System.out.println("AveragePrice = " + Product.getAveragePrice());
    }
}
