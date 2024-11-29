package ru.courses.main;

import ru.courses.geometry.*;
import ru.courses.math.*;
import ru.courses.birds.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(1, 1);

        // Создаем линии
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        // Проверка equals
        System.out.println("line1 equals line2: " + line1.equals(line2)); // true

        // Проверка hashCode
        System.out.println("line1 hashCode: " + line1.hashCode());
        System.out.println("line2 hashCode: " + line2.hashCode());

        // Проверка clone
        Line clonedLine = line1.clone();
        System.out.println("clonedLine: " + clonedLine); // Line{start=(0, 0), end=(1, 1)}
        System.out.println("line1 == clonedLine: " + (line1 == clonedLine)); // false
        System.out.println("line1.equals(clonedLine): " + line1.equals(clonedLine)); // true
    }
}
