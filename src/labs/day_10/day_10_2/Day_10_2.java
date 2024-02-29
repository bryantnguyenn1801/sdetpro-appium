package labs.day_10.day_10_2;

import java.util.ArrayList;
import java.util.List;

public class Day_10_2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        addFullTimeEmployees(employeeList, 3);
        addContractEmployees(employeeList, 2);
        int totalSalary = SalaryController.calculateSalary(employeeList);
        System.out.println("Total salary for all employees: " + totalSalary);
    }

    public static void addFullTimeEmployees(List<Employee> employeeList, int numEmployees) {
        for (int i = 0; i < numEmployees; i++) {
            employeeList.add(new FulltimeEmployee()); // Full-time employee
        }
    }

    public static void addContractEmployees(List<Employee> employeeList, int numEmployees) {
        for (int i = 0; i < numEmployees; i++) {
            employeeList.add(new ContractEmployee()); // Contract employee
        }
    }
}
