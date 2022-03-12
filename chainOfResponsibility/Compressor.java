package com.mowithmosh.chainOfResponsibility;

public class Compressor extends Handler{
    public Compressor(Handler next) {
        super(next);
    }

    private void compress(HttpRequest request) {
        System.out.println("Compress");
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        compress(request);

        return false;
    }
}
