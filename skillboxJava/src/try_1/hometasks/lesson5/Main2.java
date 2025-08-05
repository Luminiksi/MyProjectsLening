package try_1.hometasks.lesson5;

public class Main2 {
    public static void main(String[] args) {
        Cargo cargo = new Cargo(new Dimensions(12.5, 4.0, 10.3), 342.4, "Северные поля 13", false, "234dsf435", true);
        Cargo cargo1 = cargo.setAddress("Южные поля 10");
        Cargo cargo2 = cargo.setDimensions(new Dimensions(2, 56, 12.5));
        Cargo cargo3 = cargo1.setWeight(23);

        cargo.printInfo();
        System.out.println("______________________________________________");
        cargo1.printInfo();
        System.out.println("______________________________________________");
        cargo2.printInfo();
        System.out.println("______________________________________________");
        cargo3.printInfo();

    }
}
