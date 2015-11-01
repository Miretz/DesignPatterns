package com.miretz.designpatterns.command;

public class CarMoveCommand implements CommandBase {

    private final Car car;

    public CarMoveCommand(final Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("CarMoveCommand.execute(): Invoking move() on Car");
        car.move();
    }

    @Override
    public void undo() {
        System.out.println("CarMoveCommand.undo(): Invoking stop() on Car");
        car.stop();
    }
}
