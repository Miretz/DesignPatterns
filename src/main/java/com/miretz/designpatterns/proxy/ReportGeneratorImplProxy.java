package com.miretz.designpatterns.proxy;

/**
 * Created by Miretz on 1. 11. 2015.
 */

//Proxy object with the same interface
public class ReportGeneratorImplProxy implements ReportGenerator {

    ReportGenerator reportGeneratorImpl;

    final private Role accessRole;

    public ReportGeneratorImplProxy(final Role accessRole) {
        this.accessRole = accessRole;
    }

    @Override
    public void displayReportTemplate(final String reportFormat, final int reportEntries) {
        System.out.println("ReportGeneratorImplProxy: Displaying blank report template in " + reportFormat + " format with " + reportEntries + " entries");
    }

    @Override
    public void generateComplexReports(final String reportFormat, final int reportEntries) {
        if (reportGeneratorImpl == null) {
            reportGeneratorImpl = new ReportGeneratorImpl();
            reportGeneratorImpl.generateComplexReports(reportFormat, reportEntries);
        }

    }

    @Override
    public void generateSensitiveReport() {
        if (accessRole.getRole().equals("Manager")) {
            if (reportGeneratorImpl == null) {
                reportGeneratorImpl = new ReportGeneratorImpl();
                reportGeneratorImpl.generateSensitiveReport();
            }
        }
        else {
            System.out.println("You are not authorized to access sensitive reports.");
        }
    }
}
