package main.try_2.hometasks.lesson_4;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 2, 1000);
        basket.print("Milk");
        System.out.println(basket.getTotalWeight());
    }
}