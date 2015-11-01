package com.miretz.designpatterns.facade;

import com.miretz.designpatterns.facade.model.Item;
import com.miretz.designpatterns.facade.services.DatabaseService;
import com.miretz.designpatterns.facade.services.PaymentService;
import com.miretz.designpatterns.facade.services.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

    public boolean placeOrder(final int itemId) {

        Item item = DatabaseService.getItem(itemId);

        if (item != null) {
            if (PaymentService.makePayment()) {
                ShippingService.shipItem(item);
                return true;
            }
        }

        return false;
    }

}
