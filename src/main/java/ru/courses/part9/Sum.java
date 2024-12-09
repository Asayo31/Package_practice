package ru.courses.part9;

public class Sum {
    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            try {
                double number = Double.parseDouble(arg);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Некорректное значение: \"" + arg + "\", будет считаться как 0.");
            }
        }

        System.out.println("Результат сложения: " + sum);
    }
}

//1. Сохраните код в файл Sum.java
//2. скомпилировать javac Sum.java
//3. запустить через командную строку java Sum 10 3qq4 1