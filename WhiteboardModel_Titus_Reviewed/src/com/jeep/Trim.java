package com.jeep;

public enum Trim {
    RUBICON("Rubicon"),
    MOJAVE("Mojave"),
    WILLYS("Willys"),
    SPORT("Sports"),
    OVERLAND("Overland");

    private final String display;

    Trim(String display) {
        this.display = display;
    }

    public String trimDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return trimDisplay();

    }
}