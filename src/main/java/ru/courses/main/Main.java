package ru.courses.main;

import ru.courses.organization.Department;
import ru.courses.organization.Employee;

public class Main {
    public static void main(String[] args) {
        // Создаем отделы
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        // Создаем сотрудников
        Employee alice = new Employee("Alice");
        Employee bob = new Employee("Bob");
        Employee charlie = new Employee("Charlie");

        // Назначаем сотрудников в отделы
        itDept.addEmployee(alice);
        itDept.addEmployee(bob);
        hrDept.addEmployee(charlie);

        // Устанавливаем начальников
        itDept.setHead(alice);
        hrDept.setHead(charlie);

        // Выводим информацию о сотрудниках
        System.out.println(alice);   // Alice начальник отдела IT
        System.out.println(bob);     // Bob работает в отделе IT, начальник которого Alice
        System.out.println(charlie); // Charlie начальник отдела HR
    }
}
