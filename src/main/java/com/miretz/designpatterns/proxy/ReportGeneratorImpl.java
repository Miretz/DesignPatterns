package com.miretz.designpatterns.proxy;

/**
 * Created by Miretz on 1. 11. 2015.
 */
public class ReportGeneratorImpl implements ReportGenerator {

    public ReportGeneratorImpl() {
        System.out.println("ReportGeneratorImpl instance created");
    }

    @Override
    public void displayReportTemplate(final String reportFormat, final int reportEntries) {

    }

    @Override
    public void generateComplexReports(final String reportFormat, final int reportEntries) {
        System.out.println("ReportGeneratorImpl: generateComplexReports in " + reportFormat + " with " + reportEntries + " entries");
    }

    @Override
    public void generateSensitiveReport() {
        System.out.println("ReportGeneratorImpl: Generating sensitive report");
    }
}
