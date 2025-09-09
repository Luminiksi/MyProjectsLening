package main.try_2.InternetShop;

public class Main {

    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 55);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket();
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900);

        vasyaBasket.print("Корзина Васи:");
        System.out.println();
        petyaBasket.print("Корзина Пети:");
    }
}
