package com.miretz.designpatterns.bridge;

public class EmailMessage extends Message {

    public EmailMessage(final MessageSender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.send();
    }
}
