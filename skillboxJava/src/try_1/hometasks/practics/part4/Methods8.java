package try_1.hometasks.practics.part4;

public class Methods8 {
    public static void main(String[] args) {
        Order2 order1 = new Order2();
        order1.addProducts(201, 40000);
        order1.addProducts(317, 12000);
        System.out.println(
                "Количество: " + order1.getProductsCount()
        );
        System.out.println(
                "Стоимость: " + order1.getTotalCost()
        );
    }
}
