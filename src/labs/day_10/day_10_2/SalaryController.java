package labs.day_10.day_10_2;

import java.util.List;

public class SalaryController {
    public static int calculateSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;

    }
}
