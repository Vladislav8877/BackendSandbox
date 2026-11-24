package io.github.vladislav8877.springcore.step2b_di_interface;

public class Step2bMain {
    public static void main(String[] args) {
        new NotificationManager(new EmailSender()).sendWelcome("ivan@gmail.com");
//        EmailSender emailSender = new EmailSender();
//        NotificationManager manager = new NotificationManager(emailSender);
//        manager.sendWelcome("ivan@gmail.com");
        new NotificationManager(new SmsSender()).sendWelcome("+79897093585");

        new NotificationManager((to, text) -> System.out.println("TEST: " + to + " " + text))
                .sendWelcome("test");
    }
}