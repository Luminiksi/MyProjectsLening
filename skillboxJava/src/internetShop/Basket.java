package internetShop;

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    public static int count = 0;

    public Basket() {
        count++;
        items = "Список товаров:";
        this.limit = 10000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.totalPrice = totalPrice;
        this.items += items;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + (count * price) >= limit) {
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice += count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return (items.contains(name));
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
