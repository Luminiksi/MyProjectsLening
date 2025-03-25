package hometasks.lesson14;

public class TopManager implements Employee {
    private static final double SALARY = 150_000;
    private static final double BONUS = 1.5;
    private Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        if (company.getIncome() > 10_000_000) {
            return SALARY + SALARY * BONUS;
        }
        return SALARY;
    }
}
