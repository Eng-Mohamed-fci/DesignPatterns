package com.mowithmosh.chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    private boolean authenticate(HttpRequest request) {
        System.out.println("Authentication");

        boolean isValid = (request.getUsername() == "admin" &&
                request.getPassword() == "1234");

        return isValid;
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        return !authenticate(request);
    }
}
