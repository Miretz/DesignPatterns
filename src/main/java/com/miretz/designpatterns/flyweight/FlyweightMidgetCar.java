package com.miretz.designpatterns.flyweight;

public class FlyweightMidgetCar extends RaceCar {

    public static int num;

    public FlyweightMidgetCar() {
        num++;
    }

    @Override
    public void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println("New location of " + this.name + " is X" + newX + " - Y" + newY);
    }

}
