package com.miretz.designpatterns.decorator;

public abstract class AbstractBasket {

    protected String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
