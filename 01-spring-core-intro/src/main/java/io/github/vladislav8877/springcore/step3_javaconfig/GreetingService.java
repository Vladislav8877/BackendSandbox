package io.github.vladislav8877.springcore.step3_javaconfig;

public class GreetingService {

    public GreetingService() {
        System.out.println("[GreetingService] создан");
    }

    public String createGreeting(String name) {
        return "Hello " + name + "!";
    }
}