package com.example.Homework282;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
@Service
public class DepartmentService {
    private List<Employee> employees;

    // конструктор, инициализация списка сотрудников

    public Employee getEmployeeWithMaxSalary(int departmentId) {
        // реализация поиска сотрудника с максимальной зарплатой в отделе
        return null;
    }

    public Employee getEmployeeWithMinSalary(int departmentId) {
        // реализация поиска сотрудника с минимальной зарплатой в отделе
        return null;
    }

    public List<Employee> getAllEmployeesInDepartment(int departmentId) {
        // реализация получения всех сотрудников в отделе
        return null;
    }

    public Map<String, List<Employee>> getAllEmployeesByDepartment() {
        // реализация получения всех сотрудников с разделением по отделам
        return null;
    }
}

