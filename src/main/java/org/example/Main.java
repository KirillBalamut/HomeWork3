package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван", 30, 50000, "Отдел разработки"));
        employees.add(new Employee("Алексей", 25, 60000, "Отдел маркетинга"));
        employees.add(new Employee("Елена", 35, 45000, "Отдел продаж"));
        employees.add(new Employee("Мария", 28, 55000, "Отдел разработки"));
        employees.add(new Employee("Дмитрий", 32, 58000, "Отдел маркетинга"));
        employees.add(new Employee("Ольга", 27, 52000, "Отдел продаж"));
        employees.add(new Employee("Андрей", 29, 51000, "Отдел разработки"));
        employees.add(new Employee("Наталья", 31, 59000, "Отдел маркетинга"));
        employees.add(new Employee("Сергей", 26, 48000, "Отдел продаж"));
        employees.add(new Employee("Екатерина", 33, 56000, "Отдел разработки"));
        employees.add(new Employee("Александра", 24, 53000, "Отдел маркетинга"));
        employees.add(new Employee("Владимир", 30, 54000, "Отдел продаж"));
        employees.add(new Employee("Анна", 35, 57000, "Отдел разработки"));
        employees.add(new Employee("Павел", 25, 49000, "Отдел маркетинга"));
        employees.add(new Employee("Татьяна", 34, 60000, "Отдел продаж"));
        employees.add(new Employee("Максим", 28, 55000, "Отдел разработки"));
        employees.add(new Employee("Евгения", 32, 58000, "Отдел маркетинга"));
        employees.add(new Employee("Артем", 27, 52000, "Отдел продаж"));
        employees.add(new Employee("Ирина", 29, 51000, "Отдел разработки"));
        employees.add(new Employee("Антон", 31, 59000, "Отдел маркетинга"));
        employees.add(new Employee("Людмила", 26, 48000, "Отдел продаж"));
        employees.add(new Employee("Григорий", 33, 56000, "Отдел разработки"));
        employees.add(new Employee("Светлана", 24, 53000, "Отдел маркетинга"));



        Collections.sort(employees);

        System.out.println("Сортировка по возрасту:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Сортировка по зарплате (убывание)
        employees.sort(new SalaryComparator());

        System.out.println("\nСортировка по зарплате:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Сортировка по наименованию отдела (в лексикографическом порядке)
        employees.sort(new DepartmentComparator());

        System.out.println("\nСортировка по отделам:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee implements Comparable<Employee> {
    private final String name;
    private final int age;
    private final double salary;
    private final String department;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Double.compare(emp2.getSalary(), emp1.getSalary());
    }
}

class DepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getDepartment().compareTo(emp2.getDepartment());
    }
}