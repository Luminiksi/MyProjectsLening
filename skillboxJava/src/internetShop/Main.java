package internetShop;

public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket();
        petyaBasket.add("Лопата", 280);
        System.out.println();
        petyaBasket.add("Ведро", 2900);

        vasyaBasket.print("Корзина Васи:");
        petyaBasket.print("Корзина Пети:");
    }
}
