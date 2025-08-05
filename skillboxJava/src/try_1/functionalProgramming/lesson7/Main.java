package try_1.functionalProgramming.lesson7;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Test");
        product.setPrice(123);
        System.out.println(product.getName() + " - " + product.getPrice());
        System.out.println();

        Product1 product1 = new Product1("Test2", 1231);
        System.out.println(product1.getName() + " - " + product1.getPrice());
        System.out.println();

        Product1 product2 = new Product1();
        product2.setName("Test");
        product2.setPrice(123);
        System.out.println(product2.getName() + " - " + product2.getPrice());
        System.out.println();

        System.out.println(product);
        System.out.println();
        System.out.println(product2);
        System.out.println();

    }
}
