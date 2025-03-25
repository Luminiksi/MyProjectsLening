package hometasks.lesson14;

public class Operator implements Employee {
    private static final double SALARY = 45_000;

    @Override
    public double getMonthSalary() {
        return SALARY;
    }
}
