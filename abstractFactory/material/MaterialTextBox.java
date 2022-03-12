package com.mowithmosh.abstractFactory.material;

import com.mowithmosh.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
