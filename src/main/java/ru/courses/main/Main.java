package ru.courses.main;

import ru.courses.geometry.Point; // Импортируем нашу точку

public class Main {
    public static void main(String[] args) {
        // Экземпляр нашей точки
        Point customPoint = new Point(3, 4);

        // Экземпляр стандартной точки из java.awt, используя полное имя класса
        java.awt.Point awtPoint = new java.awt.Point(5, 6);

        // Вывод значений точек
        System.out.println("Custom Point from ru.courses.geometry: " + customPoint);
        System.out.println("AWT Point from java.awt: " + awtPoint);
    }
}
