package labs.lab07.lab07_1;

import java.util.List;

public class SalaryController {
    public static int calculateSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;

    }
}
