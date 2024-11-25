package ru.courses.geometry;

public class Square extends Figure {
    private final Point topLeft;
    private final double sideLength;

    public Square(Point topLeft, double sideLength) {
        this.topLeft = topLeft;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
