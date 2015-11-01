package com.miretz.designpatterns.chainofresponsibility;

public class Type3Handler extends AbstractHandler {

    public Type3Handler(final int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(final String message) {
        System.out.println("Type3 Handler: Processing request. " + message);
    }

}
