package com.miretz.designpatterns.chainofresponsibility;

public class Type1Handler extends AbstractHandler {

    public Type1Handler(final int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(final String message) {
        System.out.println("Type1 Handler: Processing request. " + message);
    }

}
