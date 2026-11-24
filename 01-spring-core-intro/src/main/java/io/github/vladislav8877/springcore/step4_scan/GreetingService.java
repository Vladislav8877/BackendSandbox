package io.github.vladislav8877.springcore.step4_scan;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public GreetingService() {
        System.out.println("[scan.GreetingService] создан");
    }

    public String createGreeting(String name) {
        return "Hello " + name + "!";
    }
}