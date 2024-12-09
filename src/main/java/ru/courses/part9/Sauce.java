package ru.courses.part9;


public class Sauce {
    private final String name;
    private final Spiciness spiciness;

    public Sauce(String name, Spiciness spiciness) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        this.name = name;
        this.spiciness = spiciness;
    }

    public String getName() {
        return name;
    }

    public Spiciness getSpiciness() {
        return spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness.getDescription();
    }
}
