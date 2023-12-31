package com.example.Homework282;

public class Employee {
    private String name;
    private int salary;
    private String department;

    private static int counter = 0;

    private final int id;
    private final String fullName;

    public Employee(String fullName, int department, double salary) {
        this.id = ++counter;
        this.fullName = fullName;
        this.department = String.valueOf(department);
        this.salary = (int) salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = String.valueOf(department);
    }

    public void setSalary(double salary) {

        this.salary = (int) salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

