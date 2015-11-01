package com.miretz.designpatterns.chainofresponsibility;

public class Type2Handler extends AbstractHandler {

    public Type2Handler(final int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(final String message) {
        System.out.println("Type2 Handler: Processing request. " + message);
    }

}
