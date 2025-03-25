package hometasks.lesson14;

public class Manager implements Employee {
    private static final int MIN_SALES = 115_000;
    private static final int MAX_SALES = 140_000;
    private static final double SALARY = 95_000;
    private static final double BONUS = 0.05;
    private int sales;

    public Manager() {
        int max = MAX_SALES - MIN_SALES;
        this.sales = (int) (MIN_SALES + Math.random() * max);
    }

    @Override
    public double getMonthSalary() {
        return SALARY + sales * BONUS;
    }

    public int getSales() {
        return sales;
    }
}
