package com.miretz.designpatterns.proxy;

/**
 * Created by Miretz on 1. 11. 2015.
 */
public interface ReportGenerator {

    void displayReportTemplate(final String reportFormat, final int reportEntries);
    void generateComplexReports(final String reportFormat, final int reportEntries);
    void generateSensitiveReport();
}
