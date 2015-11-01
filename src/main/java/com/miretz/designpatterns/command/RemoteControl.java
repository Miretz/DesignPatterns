package com.miretz.designpatterns.command;

public class RemoteControl {

    private CommandBase undoCommand;

    public void onButtonPressed(CommandBase onCommand) {
        onCommand.execute();
        undoCommand = onCommand;
    }

    public void offButtonPressed(CommandBase offCommand) {
        offCommand.execute();
        undoCommand = offCommand;
    }

    public void undoButtonPressed(){
        undoCommand.undo();
    }

}
