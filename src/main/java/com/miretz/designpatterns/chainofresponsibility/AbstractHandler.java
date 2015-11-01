package com.miretz.designpatterns.chainofresponsibility;

public abstract class AbstractHandler {

    public static final int REQUEST_TYPE_1 = 1;
    public static final int REQUEST_TYPE_2 = 2;
    public static final int REQUEST_TYPE_3 = 3;

    protected int level;

    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void receiveRequest(final int level, final String message) {
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

    abstract protected void handleRequest(final String message);

}
