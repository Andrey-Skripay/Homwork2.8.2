package com.example.Homework282;
import org.springframework.stereotype.Service;
import com.example.Homework282.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    private List<Employee> employees;

    public DepartmentService() {
        employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 1, 5000));
        employees.add(new Employee("Jane Smith", 1, 6000));
        employees.add(new Employee("Mike Johnson", 2, 4500));
        employees.add(new Employee("Emily Davis", 2, 5500));
    }

    public Employee getEmployeeWithMaxSalary(int departmentId) {
        return employees.stream()
                .filter(employee -> employee.getDepartment() == departmentId)
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }

    public Employee getEmployeeWithMinSalary(int departmentId) {
        return employees.stream()
                .filter(employee -> employee.getDepartment() == departmentId)
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }

    public List<Employee> getAllEmployeesInDepartment(int departmentId) {
        return employees.stream()
                .filter(employee -> employee.getDepartment() == departmentId)
                .collect(Collectors.toList());
    }

    public Map<String, List<Employee>> getAllEmployeesByDepartment() {
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> String.valueOf(employee.getDepartment())));
    }
}


