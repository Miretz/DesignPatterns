package com.miretz.designpatterns.bridge;

public abstract class Message {

    protected MessageSender sender;

    public Message(final MessageSender sender) {
        this.sender = sender;
    }

    public abstract void send();
}
