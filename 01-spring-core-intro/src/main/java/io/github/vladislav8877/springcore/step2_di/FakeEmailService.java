package io.github.vladislav8877.springcore.step2_di;

public class FakeEmailService extends EmailService {

    @Override
    public void sendEmail(String to, String text) {
        System.out.println("FAKE email " + "-> " + text);
    }
}