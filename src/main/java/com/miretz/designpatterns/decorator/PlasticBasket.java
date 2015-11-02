package com.miretz.designpatterns.decorator;

public class PlasticBasket extends AbstractBasket {

    public PlasticBasket() {
        description = "Plastic Basket";
    }

    @Override
    public double cost() {
        return 5.0;
    }

}
