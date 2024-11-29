package ru.courses.main;

import ru.courses.geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);

        // Проверка equals
        System.out.println("point1 equals point2: " + point1.equals(point2)); // true
        System.out.println("point1 equals point3: " + point1.equals(point3)); // false

        // Проверка hashCode
        System.out.println("point1 hashCode: " + point1.hashCode());
        System.out.println("point2 hashCode: " + point2.hashCode());
        System.out.println("point3 hashCode: " + point3.hashCode());

        // Проверка clone
        Point clonedPoint = point1.clone();
        System.out.println("clonedPoint: " + clonedPoint); // (3, 4)
        System.out.println("point1 == clonedPoint: " + (point1 == clonedPoint)); // false
        System.out.println("point1 equals clonedPoint: " + point1.equals(clonedPoint)); // true
    }
}
