package com.miretz.designpatterns.facade;

public class OrderController {

    private final OrderServiceFacade facade;

    public OrderController() {
        this.facade = new OrderServiceFacadeImpl();
    }

    public void orderItem(int itemId) {
        if (facade.placeOrder(itemId)) {
            System.out.println("Order successful.");
        }
        else {
            System.out.println("Cannot complete the order.");
        }

    }

}
