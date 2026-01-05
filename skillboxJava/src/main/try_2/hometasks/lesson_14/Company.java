package main.try_2.hometasks.lesson_14;

import java.util.*;

public class Company {
    private String name;
    private ArrayList<Employee> employes;

    public Company(String name) {
        this.name = name;
        this.employes = new ArrayList<>();
    }

    public void hire(Employee employee) {
        employes.add(employee);
    }

    public void hireAll(Collection<Employee> employes) {
        this.employes.addAll(employes);
    }

    public void fire(Employee employee) {
        employes.remove(employee);
    }

    public double getIncome() {
        double income = 0;
        for (Employee employee : employes) {
            if (employee instanceof Manager) {
                income += ((Manager) employee).getMonthSale();
            }
        }
        return income;
    }

    public List<Employee> getEmployes() {
        return new ArrayList<>(employes);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        employes.sort(Comparator.comparingDouble(Employee::getMonthSalary));
        return employes.subList(0, Math.min(count, employes.size()));
    }

    public List<Employee> getTopSalaryStaff(int count) {
        employes.sort((o1, o2) -> -Double.compare(o1.getMonthSalary(), o2.getMonthSalary()));
        return employes.subList(0, Math.min(count, employes.size()));
    }

    public void init(int countOperators, int countManagers, int countTopManagers) {
        for (int i = 0; i < countOperators; i++) {
            Operator operator = new Operator();
            hire(operator);
        }
        for (int i = 0; i < countManagers; i++) {
            Manager manager = new Manager();
            hire(manager);
        }
        for (int i = 0; i < countTopManagers; i++) {
            TopManager topManager = new TopManager(this);
            hire(topManager);
        }
    }

    public String getName() {
        return name;
    }
}
