package com.mowithmosh.composite.me;

public class RenderOperation implements Operation {
    @Override
    public void apply() {
        System.out.println("Render");
    }
}
