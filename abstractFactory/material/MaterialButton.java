package com.mowithmosh.abstractFactory.material;

import com.mowithmosh.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
