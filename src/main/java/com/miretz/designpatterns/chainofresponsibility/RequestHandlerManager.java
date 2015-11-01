package com.miretz.designpatterns.chainofresponsibility;

/**
 * Created by Miretz on 1. 11. 2015.
 */
public class RequestHandlerManager {

    //this will setup the chain of handlers
    public static AbstractHandler getHandlerChain() {

        //setup request handlers
        Type1Handler handler1 = new Type1Handler(AbstractHandler.REQUEST_TYPE_1);
        Type2Handler handler2 = new Type2Handler(AbstractHandler.REQUEST_TYPE_2);
        Type3Handler handler3 = new Type3Handler(AbstractHandler.REQUEST_TYPE_3);

        //setup workflow
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        //return first handler
        return handler1;

    }

}
