package com.miretz.designpatterns.chainofresponsibility;

/**
 * Created by Miretz on 1. 11. 2015.
 */
public class Type1Handler extends AbstractHandler {

    public Type1Handler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println("Type1 Handler: Processing request. " + message);
    }

}
