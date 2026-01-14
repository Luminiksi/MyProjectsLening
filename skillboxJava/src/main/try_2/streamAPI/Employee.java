package main.try_2.streamAPI;

import java.time.LocalDate;

public class Employee {
    private int salary;
    private LocalDate hiringDate;

    public Employee(int salary, LocalDate hiringDate) {
        this.salary = salary;
        this.hiringDate = hiringDate;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }
}
