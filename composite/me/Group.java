package com.mowithmosh.composite.me;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void execute(Operation operation) {
        for (var child : components)
            child.execute(operation);
    }

}
