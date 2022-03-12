package com.mowithmosh.command.editor;

public class undoCommand implements Command{
    private History history;

    public undoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.getSize()==0)
            return;
        var lastCommand = history.pop();
        lastCommand.unexecute();
    }
}
