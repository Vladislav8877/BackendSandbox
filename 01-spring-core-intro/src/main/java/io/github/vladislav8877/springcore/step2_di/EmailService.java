package io.github.vladislav8877.springcore.step2_di;

public class EmailService {

    public void sendEmail(String to, String text) {
        System.out.println("Отправляю письмо: " + to + ": " + text);
    }
}