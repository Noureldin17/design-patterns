import command.command.Command;
import command.concrete_command.LightOffCommand;
import command.concrete_command.LightOnCommand;
import command.invoker.RemoteControl;
import command.receiver.Light;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightsOn = new LightOnCommand(livingRoomLight);
        Command lightsOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightsOn);
        remote.pressButton();

        remote.setCommand(lightsOff);
        remote.pressButton();
    }
}