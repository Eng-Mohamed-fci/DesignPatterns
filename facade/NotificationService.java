package com.mowithmosh.facade;

public class NotificationService {
    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("ip:1112300");
        var authToken = server.authenticate("appId:1233", "Mm0123456");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
