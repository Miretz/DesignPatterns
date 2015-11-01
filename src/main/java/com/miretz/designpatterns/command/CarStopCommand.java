package com.miretz.designpatterns.command;

public class CarStopCommand implements CommandBase {

    private final Car car;

    public CarStopCommand(final Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("CarStopCommand.execute(): Invoking stop() on Car");
        car.stop();
    }

    @Override
    public void undo() {
        System.out.println("CarStopCommand.undo(): Invoking move() on Car");
        car.move();
    }
}
