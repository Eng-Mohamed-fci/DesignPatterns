package com.mowithmosh.mediator;

import java.util.*;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEvenHandlers() {
        for (var observer : eventHandlers)
            observer.handle();
    }
}
