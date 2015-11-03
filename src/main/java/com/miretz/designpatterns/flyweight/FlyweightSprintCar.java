package com.miretz.designpatterns.flyweight;

public class FlyweightSprintCar extends RaceCar {

    public static int num;

    public FlyweightSprintCar() {
        num++;
    }

    @Override
    public void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println("New location of " + this.name + " is X" + newX + " - Y" + newY);
    }

}
