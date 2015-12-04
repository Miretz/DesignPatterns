package com.miretz.designpatterns.bridge;

import org.junit.Test;

public class BridgePatternTest {

    @Test
    public void testBridgePattern(){

        MessageSender textMessageSender=new TextMessageSender();
        Message textMessage=new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender=new EmailMessageSender();
        Message emailMessage=new TextMessage(emailMessageSender);
        emailMessage.send();

    }

}
