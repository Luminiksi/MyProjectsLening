package main.try_2.hometasks.lesson_14;

public class Operator implements Employee {

    private double fixSalary = 110_000;

    @Override
    public double getMonthSalary() {
        return fixSalary;
    }

    @Override
    public String toString() {
        return "Оператор - " + getMonthSalary() + "руб.";
    }
}
