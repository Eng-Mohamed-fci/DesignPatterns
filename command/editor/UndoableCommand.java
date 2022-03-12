package com.mowithmosh.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
