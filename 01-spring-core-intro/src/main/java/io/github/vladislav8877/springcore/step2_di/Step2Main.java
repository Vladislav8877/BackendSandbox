package io.github.vladislav8877.springcore.step2_di;

public class Step2Main {
    public static void main(String[] args) {
        EmailService real = new EmailService();
        NotificationManager prod = new NotificationManager(real);
        prod.sendWelcome("ivan@gmail.com");

        System.out.println("---");

        FakeEmailService fake = new FakeEmailService();
        NotificationManager test = new NotificationManager(fake);
        test.sendWelcome("ivan@gmail.com");
    }
}