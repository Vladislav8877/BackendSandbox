package io.github.vladislav8877.springcore.step6_example;

import org.springframework.stereotype.Component;

@Component("csv")
public class CsvExport implements Exporter {

    public CsvExport() {
        System.out.println("[CsvExport] создан");
    }

    @Override
    public void export(String date) {
        System.out.println("CSV -> " + date);
    }
}