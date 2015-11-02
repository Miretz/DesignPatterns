package com.miretz.designpatterns.decorator;

public class RibbonDecoration extends AbstractBasketDecorator {

    private final AbstractBasket basket;

    public RibbonDecoration(final AbstractBasket basket) {
        this.basket = basket;
    }

    @Override
    public String getDescription() {
        return basket.getDescription() + " with Ribbon Decoration";
    }

    @Override
    public double cost() {
        return 10.0 + basket.cost();
    }
}
