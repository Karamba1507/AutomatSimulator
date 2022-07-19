package com.company;

public enum Assortment {
    COLA("Cola"),
    SPRITE("Sprite"),
    SODA("Soda"),
    WATER("Water"),
    MARS("Mars");

    private String value;

    Assortment(String value) {
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
