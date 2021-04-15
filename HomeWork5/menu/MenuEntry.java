package com.company.menu;

public abstract class MenuEntry {
    private String title;

    protected MenuEntry(String title) {
        this.title = title;
    }

    public abstract void run();
}
