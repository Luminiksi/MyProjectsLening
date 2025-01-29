package hometasks.practics.part4;

public class Methods10 {
    public static void main(String[] args) {
        Employee dmitry = new Employee(
                "Дмитрий Алексеев", 6567
        );
        Employee nastya = new Employee(
                "Анастасия Курская", "nastya@mail.ru"
        );
        Employee masha = new Employee(
                "Мария Петрова", "masha@mail.ru", 6567
        );

        dmitry.printInfo();
        System.out.println();
        nastya.printInfo();
        System.out.println();
        masha.printInfo();
    }
}
