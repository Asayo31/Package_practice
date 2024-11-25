package ru.courses.birds;

import java.util.Random;

public class Parrot extends Bird {
    private final String text;

    public Parrot(String text) {
        this.text = text;
    }

    @Override
    public void sing() {
        Random random = new Random();
        int length = random.nextInt(text.length()) + 1;
        System.out.println(text.substring(0, length));
    }
}
