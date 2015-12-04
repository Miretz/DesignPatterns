package com.miretz.designpatterns.bridge;

public class TextMessage extends Message {

    public TextMessage(final MessageSender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.send();
    }
}
