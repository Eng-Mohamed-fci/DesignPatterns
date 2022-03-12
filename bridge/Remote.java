package com.mowithmosh.bridge;

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}
