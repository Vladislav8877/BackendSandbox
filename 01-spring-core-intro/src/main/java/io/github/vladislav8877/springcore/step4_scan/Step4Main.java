package io.github.vladislav8877.springcore.step4_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Step4Main {
    public static void main(String[] args) {

//        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class)) {
//            for (String name : context.getBeanDefinitionNames()) {
//                System.out.println("bean: " + name);
//            }
//
//            GreetingPrinter printer = context.getBean(GreetingPrinter.class);
//            printer.printGreeting("Oleg");
//
//            context.getBean(GreetingPrinter.class).printGreeting("Vladislav");
//        }

//        ApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);
//        context.getBean(GreetingPrinter.class).printGreeting("Vladislav");


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("io.github.vladislav8877.springcore.step4_scan");
        GreetingPrinter printer = context.getBean(GreetingPrinter.class);
        printer.printGreeting("Vladislav");
    }
}