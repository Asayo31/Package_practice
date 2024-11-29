package ru.courses.organization;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Employee head;
    private final List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getHead() {
        return head;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees); // Defensive copy
    }

    // Устанавливаем начальника. Начальник становится сотрудником отдела.
    public void setHead(Employee head) {
        if (!employees.contains(head)) {
            employees.add(head);
        }
        this.head = head;
    }

    // Добавление сотрудника в отдел
    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    // Удаление сотрудника
    void removeEmployee(Employee employee) {
        if (employee.equals(head)) {
            throw new IllegalArgumentException("Нельзя удалить начальника отдела.");
        }
        employees.remove(employee);
    }
}
