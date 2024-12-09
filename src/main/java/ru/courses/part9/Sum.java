package ru.courses.part9;

public class Sum {
    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            if (isNumeric(arg)) {
                sum += Double.parseDouble(arg);
            } else {
                System.out.println("Некорректное значение: \"" + arg + "\", будет считаться как 0.");
            }
        }

        System.out.println("Результат сложения: " + sum);
    }

    // Метод для проверки, является ли строка числом
    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


//1. Сохраните код в файл Sum.java
//2. скомпилировать javac Sum.java
//3. запустить через командную строку java Sum 10 3qq4 1