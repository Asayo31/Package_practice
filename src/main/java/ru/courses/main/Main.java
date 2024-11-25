package ru.courses.main;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Укажите два числа для возведения в степень");
            return;
        }

        try {
            int x = parseInt(args[0]);
            int y = parseInt(args[1]);

            double result = pow(x, y);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Аргументы должны быть целыми числами.");
        }
    }
}
