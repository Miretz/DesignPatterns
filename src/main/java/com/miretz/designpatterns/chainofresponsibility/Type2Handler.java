package com.miretz.designpatterns.chainofresponsibility;

/**
 * Created by Miretz on 1. 11. 2015.
 */
public class Type2Handler extends AbstractHandler {

    public Type2Handler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println("Type2 Handler: Processing request. " + message);
    }

}
