package io.github.vladislav8877.springcore.step5_sorokin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("io.github.vladislav8877.springcore.step5_sorokin");

        Task task = context.getBean(Task.class);
        System.out.println(task) ;

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        System.out.println("------");

         Task task2 = context.getBean("main-task",Task.class);
         // либо Task task2 = (Task) context.getBean("task"); делаем кастинг  ???
        System.out.println(task2);
        System.out.println(task == task2);
    }
}