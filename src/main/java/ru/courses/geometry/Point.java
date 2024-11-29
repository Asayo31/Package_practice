package ru.courses.geometry;

public class Point implements Cloneable {
    private int x;
    private int y;

    // Конструктор
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на совпадение ссылок
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и тип
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y; // Сравнение полей
    }

    // Переопределение метода hashCode (рекомендуется при переопределении equals)
    @Override
    public int hashCode() {
        int result = Integer.hashCode(x);
        result = 31 * result + Integer.hashCode(y);
        return result;
    }

    // Переопределение метода clone
    @Override
    public Point clone() {
        try {
            return (Point) super.clone(); // Вызов родительского метода клонирования
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование не поддерживается", e);
        }
    }
}
