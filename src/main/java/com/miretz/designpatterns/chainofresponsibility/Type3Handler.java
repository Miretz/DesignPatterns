package com.miretz.designpatterns.chainofresponsibility;

/**
 * Created by Miretz on 1. 11. 2015.
 */
public class Type3Handler extends AbstractHandler {

    public Type3Handler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println("Type3 Handler: Processing request. " + message);
    }

}
