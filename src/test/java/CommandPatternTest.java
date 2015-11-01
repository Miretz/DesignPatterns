import org.junit.Test;

import com.miretz.designpatterns.command.Car;
import com.miretz.designpatterns.command.CarMoveCommand;
import com.miretz.designpatterns.command.CarStopCommand;
import com.miretz.designpatterns.command.CommandBase;
import com.miretz.designpatterns.command.RemoteControl;
import com.miretz.designpatterns.command.RotatingTop;
import com.miretz.designpatterns.command.TopRotateCommand;
import com.miretz.designpatterns.command.TopStopRotateCommand;

/**
 * Created by Miretz on 1. 11. 2015.
 */
public class CommandPatternTest {

    @Test
    public void testCommandPattern(){

        RemoteControl remoteControl = new RemoteControl();

        System.out.println("-----Testing onButtonPressed on RemoteControl for Car-----");
        Car car = new Car();
        CommandBase carMoveCommand = new CarMoveCommand(car);
        remoteControl.onButtonPressed(carMoveCommand);

        System.out.println("-----Testing offButtonPressed on RemoteControl for Car-----");
        CommandBase carStopCommand = new CarStopCommand(car);
        remoteControl.offButtonPressed(carStopCommand);

        System.out.println("-----Testing undoButtonPressed() on RemoteControl for Car-----");
        remoteControl.undoButtonPressed();

        System.out.println("-----Testing onButtonPressed on RemoteControl for RotatingTop-----");
        RotatingTop top = new RotatingTop();
        CommandBase topRotateCommand = new TopRotateCommand(top);
        remoteControl.onButtonPressed(topRotateCommand);

        System.out.println("-----Testing offButtonPressed on RemoteControl for RotatingTop-----");
        CommandBase topStopRotateCommand = new TopStopRotateCommand(top);
        remoteControl.offButtonPressed(topStopRotateCommand);

        System.out.println("-----Testing undoButtonPressed on RemoteControl for RotatingTop-----");
        remoteControl.undoButtonPressed();

    }

}
