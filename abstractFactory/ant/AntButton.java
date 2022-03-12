package com.mowithmosh.abstractFactory.ant;

import com.mowithmosh.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
