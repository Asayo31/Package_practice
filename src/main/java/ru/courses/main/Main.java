package ru.courses.main;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Пожалуйста, передайте два параметра командной строки (X и Y).");
            return;
        }

        String xString = args[0];
        String yString = args[1];

        try {
            double result = calculatePower(xString, yString);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: один из параметров не является числом. " +
                    "Проверьте входные данные: " + xString + ", " + yString);
        }
    }

    /**
     * Возводит число X (в формате строки) в степень Y (в формате строки).
     *
     * @param xString строковое представление числа X.
     * @param yString строковое представление числа Y.
     * @return результат возведения X в степень Y.
     */
    public static double calculatePower(String xString, String yString) {
        int x = parseInt(xString);
        int y = parseInt(yString);
        return pow(x, y);
    }
}
