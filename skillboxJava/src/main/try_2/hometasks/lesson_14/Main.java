package main.try_2.hometasks.lesson_14;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static final int COUNT_OPERATORS = 180;
    public static final int COUNT_MANAGERS = 80;
    public static final int COUNT_TOP_MANAGERS = 10;

    public static void main(String[] args) {
        runTask();
    }

    public static void runTask() {
        Company company = new Company("ООО 'Моя компания'");
        company.init(COUNT_OPERATORS, COUNT_MANAGERS, COUNT_TOP_MANAGERS);

        List<Employee> employeeTop = company.getTopSalaryStaff(15);
        printEmployee(employeeTop);
        System.out.println();

        List<Employee> employeeLowest = company.getLowestSalaryStaff(15);
        printEmployee(employeeLowest);
        System.out.println();

        System.out.println("Происходит увольнение...");
        dismissHalf(company, COUNT_OPERATORS, COUNT_MANAGERS, COUNT_TOP_MANAGERS);
        System.out.println();

        employeeTop = company.getTopSalaryStaff(15);
        printEmployee(employeeTop);
        System.out.println();

        employeeLowest = company.getLowestSalaryStaff(15);
        printEmployee(employeeLowest);
    }

    public static void printEmployee(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    public static void dismissHalf(Company company, int countOperators, int countManagers, int countTopManagers) {
        List<Employee> list = company.getEmployes();
        int countHalfOpers = countOperators / 2;
        int countHalfMans = countManagers / 2;
        int countHalfTopMans = countTopManagers / 2;
        int countDismissOpers = 0;
        int countDismissMans = 0;
        int countDismissTopMans = 0;
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee instanceof Operator && countDismissOpers < countHalfOpers) {
                company.fire(employee);
                countDismissOpers++;
            } else if (employee instanceof Manager && countDismissMans < countHalfMans) {
                company.fire(employee);
                countDismissMans++;
            } else if (employee instanceof TopManager && countDismissTopMans < countHalfTopMans) {
                company.fire(employee);
                countDismissTopMans++;
            }
        }
    }
}
