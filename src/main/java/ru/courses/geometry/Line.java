package ru.courses.geometry;

public class Line implements Cloneable {
    private Point start;
    private Point end;

    // Конструктор
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Геттеры
    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Line{start=" + start + ", end=" + end + "}";
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на совпадение ссылок
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и тип
        Line other = (Line) obj;
        return start.equals(other.start) && end.equals(other.end); // Сравнение полей start и end
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        int result = start.hashCode();
        result = 31 * result + end.hashCode();
        return result;
    }

    // Переопределение метода clone
    @Override
    public Line clone() {
        try {
            // Глубокое копирование точек
            Point clonedStart = start.clone();
            Point clonedEnd = end.clone();
            return new Line(clonedStart, clonedEnd);
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование не поддерживается", e);
        }
    }
}
