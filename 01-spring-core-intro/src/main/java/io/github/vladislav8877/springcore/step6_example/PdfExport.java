package io.github.vladislav8877.springcore.step6_example;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfExport implements Exporter {

    public PdfExport() {
        System.out.println("[PdfExport] создан");
    }

    @Override
    public void export(String data) {
        System.out.println("PDF -> " + data);
    }

}