package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {

    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString()
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SortEmployee {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Surendra", 90000),
                new Employee(102, "Ravi", 70000),
                new Employee(103, "Kiran", 40000),
                new Employee(104, "Akhil", 60000)
        );

        // Sort by salary ascending order
        final String name = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst()
                .get()
                .getName();
        System.out.println(name);
    }
}