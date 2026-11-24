package io.github.vladislav8877.springcore.step3_javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Step3Main {
    public static void main(String[] args) {
        System.out.println("--- создаю контекст ---");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("--- контекст готов ---");

        // Просим контейнер отдать нам готовый бин
        GreetingPrinter printer = context.getBean(GreetingPrinter.class); // я запрашиваешь бин по его типу.
        // я передал конкретный класс. Контейнер идет в свою память и ищет объект, который является экземпляром именно этого класса
        // Используем бин как обычный объект
        printer.printGreeting("Vladislav");

        System.out.println("-----");

        GreetingPrinter p1 = context.getBean(GreetingPrinter.class);
        GreetingPrinter p2 = context.getBean(GreetingPrinter.class);
        System.out.println(p1 == p2);
        // Результат: true. Это один и тот же объект. Scope по умолчанию singleton.

        GreetingService s = context.getBean("greetingService",GreetingService.class); // Получить бин по имени.
        // Имя берётся из имени метода. Если переименовать метод в AppConfig в greetingSrv():
        // старая строка упадёт с NoSuchBeanDefinitionException.

        System.out.println("-----");

        for (String name : context.getBeanDefinitionNames()) { // Заглянуть внутрь контейнера.
            System.out.println("bean: " + name);
        }
        // Сам AppConfig тоже бин
    }
}