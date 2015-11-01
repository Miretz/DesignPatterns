package com.miretz.designpatterns.facade.services;

import com.miretz.designpatterns.facade.model.Item;

public class DatabaseService {

    public static Item getItem(final int itemId){
        /*Check Warehouse database for product availability*/
        System.out.printf("%s found and is available.", itemId);
        System.out.println();
        return new Item(itemId, "Item 01");
    }

}
