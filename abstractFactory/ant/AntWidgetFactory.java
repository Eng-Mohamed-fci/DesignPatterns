package com.mowithmosh.abstractFactory.ant;

import com.mowithmosh.abstractFactory.Button;
import com.mowithmosh.abstractFactory.TextBox;
import com.mowithmosh.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
