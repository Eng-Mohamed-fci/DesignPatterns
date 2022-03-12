package com.mowithmosh.command.editor;

public class BoldCommand implements UndoableCommand{
    private HtmlDocument document;
    private String previousContent;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute()  {
        previousContent = document.getContent();
        document.makeBold();
        //history.push(this);
        history.push(makeCopy());
    }

    @Override
    public void unexecute() {
        document.setContent(previousContent);
    }

    private BoldCommand makeCopy() {
        BoldCommand copy = new BoldCommand(document,history);
        copy.previousContent = this.previousContent;
        return copy;
    }
}
