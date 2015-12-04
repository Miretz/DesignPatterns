package com.miretz.designpatterns.bridge;

public class EmailMessageSender implements MessageSender {

    @Override
    public void send() {
        System.out.println("Email message sent.");
    }
}
