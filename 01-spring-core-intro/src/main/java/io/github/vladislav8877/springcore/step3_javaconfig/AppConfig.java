package io.github.vladislav8877.springcore.step3_javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // Описываем, как создать бин GreetingService
    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }

    // Описываем, как создать бин GreetingPrinter,
    // и говорим Spring: сюда нужно внедрить GreetingService
    @Bean
    public GreetingPrinter greetingPrinter(GreetingService greetingService) {
        return new GreetingPrinter(greetingService);
    }
}