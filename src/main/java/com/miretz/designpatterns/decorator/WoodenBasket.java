package com.miretz.designpatterns.decorator;

public class WoodenBasket extends AbstractBasket {

    public WoodenBasket(){
        description = "Wooden Basket";
    }

    @Override
    public double cost() {
        return 20.0;
    }
}
