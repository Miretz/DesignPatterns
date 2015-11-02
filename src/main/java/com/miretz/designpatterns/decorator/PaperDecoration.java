package com.miretz.designpatterns.decorator;

public class PaperDecoration extends AbstractBasketDecorator {

    private final AbstractBasket basket;

    public PaperDecoration(final AbstractBasket basket) {
        this.basket = basket;
    }

    @Override
    public String getDescription() {
        return basket.getDescription() + " with Paper Decoration";
    }

    @Override
    public double cost() {
        return 3.0 + basket.cost();
    }
}
