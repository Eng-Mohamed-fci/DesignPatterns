package com.mowithmosh.momento;

import java.util.Stack;

public class History {
    Stack<EditorState> previousStates = new Stack<>();

    public void push(EditorState state) {
        previousStates.add(state);
    }
    public EditorState pop() {
        if (previousStates.size() == 1)
            return previousStates.peek();
        return previousStates.pop();
    }
}
