package io.github.vladislav8877.springcore.step6_example;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ReportService {
    private final Map<String, Exporter> exporters;

    // Spring сам найдёт ВСЕ бины типа Exporter и положит их сюда:
    // "pdf" -> объект PdfExport
    // "csv" -> объект CsvExport
    public ReportService(Map<String, Exporter> exporters) {
        this.exporters = exporters;
    }

    public void exportService(String format, String data) {
        Exporter exporter = exporters.get(format.toLowerCase());
        if (exporter == null) {
            throw new IllegalArgumentException("Unknown format: " + format);
        }
        exporter.export(data);
    }
}