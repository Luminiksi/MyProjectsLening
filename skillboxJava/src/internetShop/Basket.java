package internetShop;

public class Basket {
    public static String items = "";
    public static int totalPrice = 0;

    public static void main(String[] args) {
        add("Колбаса", 76);
        add("Молоко", 55);
        add("Масло", 120);
        print("Содержимое корзины:");
        int totalPrice = getTotalPrice();
        System.out.println("Общая стоимость товаров: " +  totalPrice);
        clear();
        System.out.println();
        print("Содержимое корзины:");
        totalPrice = getTotalPrice();
        System.out.println("Общая стоимость товаров: " +  totalPrice);
    }

    public static void add(String name, int price) {
        if (contains(name)) {
            return;
        }
        items = items + "\n" + name + " - " + price;
        totalPrice += price;
    }

    public static void clear() {
        items = "";
        totalPrice = 0;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static boolean contains(String name) {
        return (contains(name));
    }

    public static void print(String title){
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
