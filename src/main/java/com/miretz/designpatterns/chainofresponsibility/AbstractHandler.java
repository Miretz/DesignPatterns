package com.miretz.designpatterns.chainofresponsibility;

/**
 * Created by Miretz on 1. 11. 2015.
 */
public abstract class AbstractHandler {

    public static int REQUEST_TYPE_1 = 1;
    public static int REQUEST_TYPE_2 = 2;
    public static int REQUEST_TYPE_3 = 3;

    protected int level;

    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void receiveRequest(int level, String message) {
        if (this.level == level) {
            handleRequest(message);
        }
        if (this.level < level) {
            System.out.println("Type" + this.level + " Handler: Sending message to the next handler");
        }
        if (nextHandler != null) {
            nextHandler.receiveRequest(level, message);
        }
    }

    abstract protected void handleRequest(String message);

}
