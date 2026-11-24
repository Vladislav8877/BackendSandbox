package io.github.vladislav8877.springcore.step4_scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinter {
    private final GreetingService greetingService;

    @Autowired
    // для того что бы Spring понимал через какой конструктур внедрять зависимость
    // но с версии Spring 4.3 если в классе один конструктор, Spring внедряет зависимость через него сам
    // так что можно не писать @Autowierd
    public GreetingPrinter(GreetingService greetingService) {
        System.out.println("[scan.GreetingPrinter] создан");
        this.greetingService = greetingService;
    }

    public void printGreeting(String name) {
        String text = greetingService.createGreeting(name);
        System.out.println(text);
    }
}