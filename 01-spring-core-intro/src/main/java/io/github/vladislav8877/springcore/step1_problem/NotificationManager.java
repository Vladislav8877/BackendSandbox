package io.github.vladislav8877.springcore.step1_problem;

public class NotificationManager {
    private final EmailService emailService;

    public NotificationManager() {
        System.out.println("[NotificationManager] создаю EmailService сам через new");
        this.emailService = new EmailService();
    }

    public void sendWelcome(String userEmail) {
        emailService.sendEmail(userEmail,"Добро пожаловать!");
    }
}