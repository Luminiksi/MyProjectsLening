package try_1.hometasks.lesson14;

import try_1.myFeatures.Printer;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static final int OPERATOR_COUNT = 180;
    public static final int MANAGER_COUNT = 80;
    public static final int TOP_MANAGER_COUNT = 10;
    public static final double DISMISSAL_RATIO = 0.5;


    public static void main(String[] args) {
        Company company = initCompany();
        printEmployees(company.getEmployees());
        Printer.printSeparator();

        checkSalary(company);
        Printer.printSeparator();

        dismissal(company);
        printEmployees(company.getEmployees());

    }

    public static void printEmployees(List<Employee> employees) {
        int index = 1;
        for (Employee employee :
                employees) {
            System.out.println(index + ".  " + employee.getClass() + " - " + employee.getMonthSalary());
            index++;
        }
    }

    public static Company initCompany() {
        Company company = new Company();

        for (int i = 0; i < OPERATOR_COUNT; i++) {
            company.hire(new Operator());
        }

        for (int i = 0; i < MANAGER_COUNT; i++) {
            company.hire(new Manager());
        }

        for (int i = 0; i < TOP_MANAGER_COUNT; i++) {
            company.hire(new TopManager(company));
        }

        return company;
    }

    public static void checkSalary(Company company) {
        List<Employee> topSalary = company.getTopSalaryStaff(15);
        System.out.println("Топ самых больших зарплат");
        printEmployees(topSalary);
        System.out.println();

        System.out.println("Топ самых низких зарплат");
        List<Employee> lowestSalary = company.getLowestSalaryStaff(30);
        printEmployees(lowestSalary);
    }

    public static void dismissal(Company company) {
        int operatorDis = (int) (OPERATOR_COUNT * DISMISSAL_RATIO);
        int managerDis = (int) (MANAGER_COUNT * DISMISSAL_RATIO);
        int topManagerDis = (int) (TOP_MANAGER_COUNT * DISMISSAL_RATIO);

        Iterator iterator = company.getEmployees().iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            if (employee instanceof Operator && operatorDis != 0) {
                iterator.remove();
                operatorDis--;
            } else if (employee instanceof Manager && managerDis != 0) {
                iterator.remove();
                managerDis--;
            } else if (employee instanceof TopManager && topManagerDis != 0) {
                iterator.remove();
                topManagerDis--;
            }
            if (operatorDis == 0 && managerDis == 0 && topManagerDis == 0) {
                break;
            }
        }
    }
}
