package io.github.vladislav8877.springcore.step1_problem;

public class EmailService { //публичный класс, имя совпадает с именем файла

    public void sendEmail(String to, String text) {
        System.out.println("Отправляю письмо " + to +": " + text);
    }
}