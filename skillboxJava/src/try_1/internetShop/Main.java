package try_1.internetShop;

public class Main {
    public static void main(String[] args) {
        DeliveryOrder order = new DeliveryOrder(DeliveryType.PEDESTRIAN, Fragile.NO, Cold.YES);
        createBasket();
        Session session = new Session();
        System.out.println(Basket.getCount());
    }

    public static void createBasket() {
        Basket  basket = new Basket("товары", 234231);
    }

    public static void oldTasks() {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Ведро", 2900);

        Basket mashaBasket = new Basket("Стол", 5000);
        vasyaBasket.print("Корзина Васи:");
        System.out.println();
        petyaBasket.print("Корзина Пети:");
        System.out.println();
        mashaBasket.print("Корзина Маши:");
    }
}
