package io.github.vladislav8877.springcore.step2b_di_interface;

public class NotificationManager {
    private final MessageSender sender;

    public NotificationManager(MessageSender sender) {
        this.sender = sender;
    }

    public void sendWelcome(String to) {
        sender.send(to, "Добро пожаловать!");
    }
}