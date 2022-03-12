package com.mowithmosh.abstractFactory.ant;

import com.mowithmosh.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
