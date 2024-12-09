package ru.courses.main;
import ru.courses.part9.OperationAttemptException;
import ru.courses.part9.Sauce;
import ru.courses.part9.Spiciness;
import ru.courses.geometry.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import ru.courses.geometry.Point;
import ru.courses.geometry.Polyline;

public class Main {
    public static void main(String[] args) {
        // Создаем точки
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(6, 8);

        // Создаем ломанные линии
        Polyline polyLine1 = new Polyline(p1, p2, p3);
        Polyline polyLine2 = new Polyline(new Point(0, 0), new Point(3, 4), new Point(6, 8));

        // Вывод информации
        System.out.println("polyLine1: " + polyLine1);
        System.out.println("polyLine2: " + polyLine2);

        // Сравнение ломанных
        System.out.println("polyLine1 equals polyLine2: " + polyLine1.equals(polyLine2)); // true

        // Вывод длины ломаной линии
        System.out.println("polyLine1 length: " + polyLine1.length()); // Длина


        Sauce sauce1 = new Sauce("Табаско", Spiciness.VERY_SPICY);
        Sauce sauce2 = new Sauce("Сливочный", Spiciness.NOT_SPICY);
        Sauce sauce3 = new Sauce("Чили", Spiciness.SPICY);

        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);


        //task exception 4 part 9
        String fileName = "numbers.txt"; // Замените на реальное имя файла

        try {
            int result = divide(fileName);
            System.out.println("Результат деления: " + result);
        } catch (OperationAttemptException e) {
            System.out.println("Ошибка выполнения: " + e.getMessage());
            System.out.println("Результат: 0");
        }
    }

    public static int divide(String fileName) throws OperationAttemptException {
        File file = new File(fileName);

        try (Scanner sc = new Scanner(file)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            return num1 / num2; // Возможен выброс ArithmeticException
        } catch (FileNotFoundException e) {
            throw new OperationAttemptException("Файл не найден: " + fileName, e);
        } catch (InputMismatchException e) {
            throw new OperationAttemptException("Некорректный формат данных в файле: " + fileName, e);
        } catch (NoSuchElementException e) {
            throw new OperationAttemptException("Недостаточно данных в файле: " + fileName, e);
        } catch (ArithmeticException e) {
            throw new OperationAttemptException("Деление на ноль в файле: " + fileName, e);
        }
// компиляция javac Main.java OperationAttemptException.java
// java Main
    }
}
