package com.mowithmosh.composite.me;

public class Shape implements Component {
    @Override
    public void execute(Operation operation) {
        operation.apply();
    }
}
