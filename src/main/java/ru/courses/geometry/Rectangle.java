package ru.courses.geometry;

public class Rectangle extends Figure {
    private final Point topLeft;
    private final double width;
    private final double height;

    public Rectangle(Point topLeft, double width, double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
