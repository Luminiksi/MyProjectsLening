package hometasks.lesson5;

public class Product {

    private final String name;
    private int price;
    private final String barCode;

    public Product(String name, int price, String barCode) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
