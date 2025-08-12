package main.try_1.hometasks.lesson14;

import java.util.*;

public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employes) {
        employees.addAll(employes);
    }

    public void fire(Employee employee) {
        employees.remove(employee);

    }

    public int getIncome() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                sum += ((Manager) employee).getSales();
            }
        }
        return sum;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -Double.compare(o1.getMonthSalary(), o2.getMonthSalary());
            }
        });
        return employees.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getMonthSalary(), o2.getMonthSalary());
            }
        });
        return employees.subList(0, count);
    }

    private List<Employee> getSort(int count, Comparator<Employee> comparator) {
        TreeSet<Employee> employeesSortSet = new TreeSet<>(comparator);
        employeesSortSet.addAll(employees);
        ArrayList<Employee> result = new ArrayList<>();
        int index = 0;
        for (Employee employee : employeesSortSet) {
            if (index == count) {
                break;
            }
            result.add(employee);
            index++;
        }
        return result;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
