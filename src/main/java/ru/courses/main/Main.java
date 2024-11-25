package ru.courses.main;

import ru.courses.geometry.*;
import ru.courses.math.*;
import ru.courses.birds.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример работы с геометрическими фигурами
        Figure circle = new Circle(new Point(0, 0), 5);
        Figure square = new Square(new Point(0, 0), 4);
        Figure rectangle = new Rectangle(new Point(0, 0), 3, 6);

        List<Figure> figures = List.of(circle, square, rectangle);
        double totalArea = FigureUtils.sumAllAreas(figures);

        System.out.println("=== Общая площадь фигур ===");
        System.out.println("Total Area: " + totalArea);

        // Работа с дробями
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(2, 5);

        System.out.println("\n=== Работа с дробями ===");
        System.out.println("Fraction1: " + fraction1);
        System.out.println("Fraction2: " + fraction2);
    }
}
