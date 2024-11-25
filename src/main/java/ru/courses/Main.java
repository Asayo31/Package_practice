package ru.courses;

import ru.courses.geometry.*;
import ru.courses.education.*;
import ru.courses.birds.*;
import ru.courses.math.Fraction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Работа с геометрическими фигурами
        System.out.println("=== Геометрические фигуры ===");
        Circle circle = new Circle(new Point(0, 0), 5);
        Square square = new Square(new Point(1, 1), 4);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь квадрата: " + square.getArea());

        // 2. Работа с учебной системой
        System.out.println("\n=== Учебная система ===");
        Student student = new Student("Иван", grade -> grade >= 2 && grade <= 5);
        student.addGrade(3);
        student.addGrade(6); // Некорректная оценка
        student.addGrade(4);
        System.out.println(student);

        // 3. Работа с птицами
        System.out.println("\n=== Птицы ===");
        Bird sparrow = new Sparrow();
        Bird cuckoo = new Cuckoo();
        Bird parrot = new Parrot("Привет, как дела?");

        List<Bird> birds = List.of(sparrow, cuckoo, parrot);
        birds.forEach(Bird::sing);

        // 4. Работа с дробями
        System.out.println("\n=== Дроби ===");
        Fraction fraction = new Fraction(1, 3);
        System.out.println("Дробь: " + fraction);
        System.out.println("Дробь в формате double: " + fraction.doubleValue());
    }
}
