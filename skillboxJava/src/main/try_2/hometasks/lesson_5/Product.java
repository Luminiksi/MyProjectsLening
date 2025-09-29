package main.try_2.hometasks.lesson_5;

public class Product {
    private final String name;
    private int price;
    private final int barCode;

    public Product(String name, int barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBarCode() {
        return barCode;
    }

    public String toString() {
        return "Name: " + name + " Price: " + price;
    }

    public void print() {
        String info = name + " - " + price;
        System.out.println(info);
    }
}
