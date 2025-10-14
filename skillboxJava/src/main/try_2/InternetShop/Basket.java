package main.try_2.InternetShop;

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    private static int count = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 100000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items += items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }

        if (totalPrice + price * count >= limit) {
            return;
        }

        items += items.isEmpty()
                ? name + " - " + count + " шт. - " + price
                : "\n" + name + " - " + count + " шт. - " + price;
        totalPrice += price * count;

    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public static void increaseCount(int count) {
        Basket.count += count;
    }

    public static int getCount() {
        return count;
    }
}
