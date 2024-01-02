package com.example.Homework282;
import org.springframework.stereotype.Service;
import com.example.Homework282.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentService {
    private final List<Employee> employees;

    public DepartmentService() {
        employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 1, 5000));
        employees.add(new Employee("Jane Smith", 1, 6000));
        employees.add(new Employee("Mike Johnson", 2, 4500));
        employees.add(new Employee("Emily Davis", 2, 5500));
    }

    public Employee getEmployeeWithMaxSalary(int departmentId) {
        Employee maxSalaryEmployee = null;
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public Employee getEmployeeWithMinSalary(int departmentId) {
        Employee minSalaryEmployee = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public List<Employee> getAllEmployeesInDepartment(int departmentId) {
        List<Employee> departmentEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId) {
                departmentEmployees.add(employee);
            }
        }
        return departmentEmployees;
    }

    public Map<String, List<Employee>> getAllEmployeesByDepartment() {
        Map<String, List<Employee>> employeesByDepartment = new HashMap<>();
        for (Employee employee : employees) {
            int department = employee.getDepartment();
            if (!employeesByDepartment.containsKey(department)) {
                employeesByDepartment.put(String.valueOf(department), new ArrayList<>());
            }
            employeesByDepartment.get(department).add(employee);
        }
        return employeesByDepartment;
    }
}

