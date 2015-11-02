package com.miretz.designpatterns.chainofresponsibility;

import org.junit.Before;
import org.junit.Test;

import com.miretz.designpatterns.chainofresponsibility.AbstractHandler;
import com.miretz.designpatterns.chainofresponsibility.RequestHandlerManager;

public class ChainOfResponsibilityTest {

    private AbstractHandler requestHandler;

    @Before
    public void setUp() {
        requestHandler = RequestHandlerManager.getHandlerChain();
    }

    @Test
    public void testLevel1Request() {

        requestHandler.receiveRequest(AbstractHandler.REQUEST_TYPE_1, " This is a level 1 request");
        System.out.println("............................................");

    }

    @Test
    public void testLevel2Request() {

        requestHandler.receiveRequest(AbstractHandler.REQUEST_TYPE_2, " This is a level 2 request");
        System.out.println("............................................");

    }

    @Test
    public void testLevel3Request() {

        requestHandler.receiveRequest(AbstractHandler.REQUEST_TYPE_3, " This is a level 3 request");
        System.out.println("............................................");

    }

}
