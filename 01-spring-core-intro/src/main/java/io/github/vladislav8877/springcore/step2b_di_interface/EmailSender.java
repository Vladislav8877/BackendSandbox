package io.github.vladislav8877.springcore.step2b_di_interface;

public class EmailSender implements MessageSender {

    @Override
    public void send(String to, String text) {
        System.out.println("EMAIL -> " + to + ": " + text);
    }
}