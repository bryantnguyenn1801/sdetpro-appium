package labs.lab07.lab07_1;

import java.util.ArrayList;
import java.util.List;

public class Lab7_1 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        addFullTimeEmployees(employeeList, 3);
        addContractEmployees(employeeList, 3);
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
