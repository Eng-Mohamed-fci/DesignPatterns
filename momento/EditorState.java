package com.mowithmosh.momento;

public class EditorState {
    private final String content;
    private final String language;

    public EditorState(String content, String language) {
        this.content = content;
        this.language = language;
    }

    public String getContent() {
        return content;
    }
    public String getLanguage() {
        return language;
    }
}
