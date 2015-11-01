package com.miretz.designpatterns.proxy;

public interface ReportGenerator {

    void displayReportTemplate(final String reportFormat, final int reportEntries);
    void generateComplexReports(final String reportFormat, final int reportEntries);
    void generateSensitiveReport();
}
