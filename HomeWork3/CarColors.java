package com.company;

public enum CarColors {
    BLACK ("Black"),
    WHITE ("White"),
    RED ("Red"),
    BLUE ("Blue");

    private String string;

    CarColors(String str) {
        string = str;
    }

    public String getColor() {
        return string;
    }

    @Override
    public String toString() {
        return String.valueOf(string);
    }
}
