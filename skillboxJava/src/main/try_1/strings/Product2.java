package main.try_1.strings;

public class Product2 {
    private String name;
    private int price;

    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return name.concat(" - ").concat(Integer.toString(price));
    }
}
