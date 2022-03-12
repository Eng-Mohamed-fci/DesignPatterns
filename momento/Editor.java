package com.mowithmosh.momento;

import java.util.Stack;

public class Editor {
    private String content;
    private String language;

    public EditorState createState() {
        return new EditorState(content, language);
    }

    public void restore(EditorState state) {
        content = state.getContent();
        language = state.getLanguage();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
/*
 Main
// Momento Pattern
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        editor.setLanguage("c++");
        history.push(editor.createState());

        editor.setContent("b");

        history.push(editor.createState());

        editor.setContent("c");
        editor.setLanguage("python");

        editor.restore(history.pop());

        System.out.println(editor.getContent() + " " + editor.getLanguage());
 */