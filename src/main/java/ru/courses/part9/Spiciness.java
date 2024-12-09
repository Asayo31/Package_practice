package ru.courses.part9;

public enum Spiciness {
    VERY_SPICY("очень острый"),
    SPICY("острый"),
    NOT_SPICY("не острый");

    private final String description;

    Spiciness(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}