package main.try_1.hometasks.practics.part6;

public class Product {
    private final String name;
    private final int price;

    private static int count = 0;
    private static int totalPrice = 0;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        count++;
        totalPrice += price;
    }

    public static double getAveragePrice() {
        return (double) totalPrice / count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }
}
