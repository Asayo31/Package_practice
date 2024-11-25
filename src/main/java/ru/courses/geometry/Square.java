package ru.courses.geometry;

public class Square {
    private final Point topLeft;
    private final double side;

    public Square(Point topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
