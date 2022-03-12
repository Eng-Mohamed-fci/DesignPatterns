package com.mowithmosh.chainOfResponsibility;

public class Logger extends Handler{
    public Logger(Handler next) {
        super(next);
    }

    public void log(HttpRequest request) {
        System.out.println("log");
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        log(request);

        return false;
    }
}
