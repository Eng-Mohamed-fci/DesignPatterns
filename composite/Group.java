package com.mowithmosh.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void render() {
        for (var child : components)
            child.render();
    }

    @Override
    public void move() {
        for (var child : components)
            child.move();
    }
}
