package com.mowithmosh.command.editor;

public class HtmlDocument {
    private String Content;

    public void makeBold() {
        setContent("<b>" + getContent() + "<\\b>");
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
