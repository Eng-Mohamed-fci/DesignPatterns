package com.mowithmosh.bridge;

public class SumsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sumsung turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sumsung turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sumsung setChannel");
    }
}
