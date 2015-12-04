package com.miretz.designpatterns.bridge;

public class TextMessageSender implements MessageSender {

    @Override
    public void send() {
        System.out.println("Text message sent.");
    }
}
