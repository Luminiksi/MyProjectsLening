package main.try_2.hometasks.Lesson_5.immutability;

public class Product {
    private final String name;
    private final String barCode;
    private int price;

    public Product(String name, String barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
