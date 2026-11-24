package io.github.vladislav8877.springcore.step2b_di_interface;

public interface MessageSender { // Контракт: «умею отправлять сообщение». Как именно, интерфейс не знает.
    void send(String to, String text);
}