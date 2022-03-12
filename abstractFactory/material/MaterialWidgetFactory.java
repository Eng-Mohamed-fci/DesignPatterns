package com.mowithmosh.abstractFactory.material;

import com.mowithmosh.abstractFactory.Button;
import com.mowithmosh.abstractFactory.TextBox;
import com.mowithmosh.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
