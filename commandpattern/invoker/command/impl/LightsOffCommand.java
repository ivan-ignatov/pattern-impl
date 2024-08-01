package commandpattern.invoker.command.impl;

import commandpattern.invoker.command.ICommand;
import commandpattern.light.ILight;

public class LightsOffCommand implements ICommand {

    private ILight light;

    public LightsOffCommand(ILight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchPower(false);
        System.out.println("Light " + light.getName() + " off.");
    }

    @Override
    public void revert() {
        this.light.switchPower(true);
    }

}
