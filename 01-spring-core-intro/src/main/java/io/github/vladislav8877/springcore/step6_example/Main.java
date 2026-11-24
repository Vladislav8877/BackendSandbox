package io.github.vladislav8877.springcore.step6_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ReportService service = context.getBean(ReportService.class);
        service.exportService("pdf", "PDF формат");
        service.exportService("csv", "CSV формат");

        // Первый подход: Если я оставляю @Component над классами и пустой AppConfig с @ComponentScan,
        // мне нужно явно подсказать Spring, какую реализацию выбрать.
        // -> с помощью аннотации public ReportService(@Qualifier("csvExport") Exporter exporter)
        // я указываю какую зависимость передать

        // Второй подход: Если ты поставишь аннотацию @Primary над PdfExport рядом с @Component,
        // Spring будет подставлять его везде по умолчанию, если в конструкторе не указан другой @Qualifier.

        // Третий подход: создаю конфиг.класс в котором описываю создание объектов с @Bean
        // и создаю методы:
        // @Bean
        //    public ReportService pdfReportService() {
        //        return new ReportService(pdfExport());
        //    }
        //
        //    @Bean ReportService csvReportService() {
        //        return new ReportService(csvExport());
        //    }
        // если в main нужны обе реализации -> ReportService service = context.getBean("pdfReportService",ReportService.class);

        // И финальный подход: самый удобный и лучший, оставил его в коде
    }
}