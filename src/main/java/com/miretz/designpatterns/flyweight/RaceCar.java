package com.miretz.designpatterns.flyweight;

public abstract class RaceCar {

    String name;
    int speed;
    int horsePower;

    abstract void moveCar(int currentX, int currentY, int newX, int newY);


}
