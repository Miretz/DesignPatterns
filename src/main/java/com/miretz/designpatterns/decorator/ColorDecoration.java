package com.miretz.designpatterns.decorator;

public class ColorDecoration extends AbstractBasketDecorator {

    private final AbstractBasket basket;

    public ColorDecoration(final AbstractBasket basket) {
        this.basket = basket;
    }

    @Override
    public String getDescription() {
        return basket.getDescription() + " with Color Decoration";
    }

    @Override
    public double cost() {
        return 3.0 + basket.cost();
    }
}
