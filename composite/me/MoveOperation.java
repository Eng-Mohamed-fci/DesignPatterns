package com.mowithmosh.composite.me;

public class MoveOperation implements Operation {
    @Override
    public void apply() {
        System.out.println("Move");
    }
}
