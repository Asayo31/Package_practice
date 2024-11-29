package ru.courses.main;
import ru.courses.math.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction fraction3 = new Fraction(5, 6);

        // Проверка equals
        System.out.println("fraction1 equals fraction2: " + fraction1.equals(fraction2)); // true
        System.out.println("fraction1 equals fraction3: " + fraction1.equals(fraction3)); // false

        // Проверка hashCode
        System.out.println("fraction1 hashCode: " + fraction1.hashCode());
        System.out.println("fraction2 hashCode: " + fraction2.hashCode());
        System.out.println("fraction3 hashCode: " + fraction3.hashCode());

        // Проверка clone
        Fraction fractionClone = fraction1.clone();
        System.out.println("fractionClone: " + fractionClone); // 3/4
        System.out.println("fraction1 == fractionClone: " + (fraction1 == fractionClone)); // false
        System.out.println("fraction1 equals fractionClone: " + fraction1.equals(fractionClone)); // true
    }
}
