package com.miretz.designpatterns.facade.services;

import com.miretz.designpatterns.facade.model.Item;

public class ShippingService {

    public static void shipItem(final Item item){
        System.out.printf("%s (%s) has been shipped.", item.getName(), item.getId());
        System.out.println();
    }

}
