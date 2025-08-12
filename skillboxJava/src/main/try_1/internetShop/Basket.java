package main.try_1.internetShop;

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    private static int count = 0;

    private static int timeout = getTimeOut() ;

    private static int getTimeOut() {
//        отрабатывают один раз в первую инициализацию
        int secondsInHour = 3600;
        int hoursInDay = 24;
        int daysInWeek = 7;
        int daysInMonth = 30;
        return secondsInHour * hoursInDay * daysInWeek;
//        пример сложной инициализации
/*        return secondsInHour * hoursInDay *
                (Period.type == PeriodType.WEEK ? daysInWeek : daysInMonth);*/
    }

/*    static {
//        отрабатывают один раз в первую инициализацию
//        но такое очень редко сейчас используют, ччаще используют пример выше
        int secondsInHour = 3600;
        int hoursInDay = 24;
        int daysInWeek = 7;
        int daysInMonth = 30;
        timeout = secondsInHour * hoursInDay * daysInWeek;
//        пример сложной инициализации
*//*        timeOut = secondsInHour * hoursInDay *
                (Period.type == PeriodType.WEEK ? daysInWeek : daysInMonth);*//*
    }*/

    public Basket() {
        increaseCount(1);
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

    public static int getCount() {
        return count;
    }
    public static void increaseCount(int count) {
        Basket.count += count;
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
