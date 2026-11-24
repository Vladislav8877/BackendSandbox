package io.github.vladislav8877.springcore.step3_javaconfig;

public class GreetingPrinter {
    private final GreetingService greetingService;

    // Внедрение зависимости через конструктор
    public GreetingPrinter(GreetingService greetingService) {
        System.out.println("[GreetingPrinter] создан, получил " + greetingService);
        this.greetingService = greetingService;
    }

    public void printGreeting(String name) {
        String text = greetingService.createGreeting(name);
        System.out.println(text);
    }
}