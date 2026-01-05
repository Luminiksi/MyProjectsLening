package main.try_2.hometasks.lesson_14;

public class Manager implements Employee {
    private static final int MIN_SALE = 115_000;
    private static final int MAX_SALE = 140_000;
    private static final double percentSale = 0.05;

    private double fixSalary = 140_000;
    private double monthSale;

    public Manager() {
        monthSale = MIN_SALE + (Math.random() * ((MAX_SALE - MIN_SALE) + 1));
    }

    @Override
    public double getMonthSalary() {
        return fixSalary + monthSale * percentSale;
    }

    public double getMonthSale() {
        return monthSale;
    }

    @Override
    public String toString() {
        return "Менеджер - " + getMonthSalary() + "руб.";
    }
}
