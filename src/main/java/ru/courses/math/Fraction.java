package ru.courses.math;

public class Fraction implements Cloneable {
    private int num;
    private int denum;

    public Fraction(int num, int denum) {
        if (denum == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.num = num;
        this.denum = denum;
    }

    // Геттеры для числителя и знаменателя
    public int getNum() {
        return num;
    }

    public int getDenum() {
        return denum;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return num + "/" + denum;
    }

    // Переопределение метода equals для сравнения дробей
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Сравнение ссылок
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка типа
        Fraction other = (Fraction) obj;
        return this.num == other.num && this.denum == other.denum; // Сравнение числителя и знаменателя
    }

    // Переопределение метода hashCode (рекомендуется при переопределении equals)
    @Override
    public int hashCode() {
        int result = Integer.hashCode(num);
        result = 31 * result + Integer.hashCode(denum);
        return result;
    }

    // Переопределение метода clone
    @Override
    public Fraction clone() {
        try {
            return (Fraction) super.clone(); // Вызов родительского метода клонирования
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование не поддерживается", e);
        }
    }
}
