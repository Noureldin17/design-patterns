package command.concrete_command;

import command.command.Command;
import command.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
