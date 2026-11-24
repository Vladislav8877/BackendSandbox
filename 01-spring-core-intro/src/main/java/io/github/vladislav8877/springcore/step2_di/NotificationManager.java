package io.github.vladislav8877.springcore.step2_di;

public class NotificationManager {
    private final EmailService emailService;

    public NotificationManager(EmailService emailService) {
        System.out.println("[NotificationManager] получил зависимость: "
                + emailService.getClass().getSimpleName());
        this.emailService = emailService;
    }

    public void sendWelcome(String userEmail) {
        emailService.sendEmail(userEmail,"Добро пожаловать!");
    }
}