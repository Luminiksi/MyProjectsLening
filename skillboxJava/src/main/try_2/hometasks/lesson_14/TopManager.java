package main.try_2.hometasks.lesson_14;

public class TopManager implements Employee {
    private static final double salaryBonuce = 1.5;

    private double fixSalary = 180_000;
    Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        double monthSalary = fixSalary;
        if (company.getIncome() > 10_000_000) {
            monthSalary += fixSalary * salaryBonuce;
        }
        return monthSalary;
    }

    @Override
    public String toString() {
        return "Топ менеджер - " + getMonthSalary() + "руб.";
    }
}
