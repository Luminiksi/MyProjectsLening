package try_1.hometasks.practics.part4;

public class Employee {
    private String name;
    private String email = "не задан";
    private int number;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Employee(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getNumber() {
        return number;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("E-mail: " + email);
        if (number == 0) {
            System.out.println("Телефон: не указан");
        } else {
            System.out.println("Телефон: " + number);
        }
    }
}
