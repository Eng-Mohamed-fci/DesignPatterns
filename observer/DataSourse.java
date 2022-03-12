package com.mowithmosh.observer;

public class DataSourse extends Subject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyOvbservers();
    }
}
