package com.mowithmosh.command.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> previousCommands = new ArrayDeque<>();
    private int size;

    public void push(UndoableCommand command) {
        size++;
        previousCommands.push(command);
    }

    public UndoableCommand pop() {
        size--;
        return previousCommands.pop();
    }

    public int getSize() {
        return size;
    }
}
