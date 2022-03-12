package com.mowithmosh.command.fx;

public class Button {
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        // do something
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
