package commandpattern.invoker.command.impl;

import commandpattern.invoker.command.ICommand;
import commandpattern.light.ILight;

public class LightsOnCommand implements ICommand {

    private ILight light;

    public LightsOnCommand(ILight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchPower(true);
        System.out.println("Light " + light.getName() + " on. Brightness: " + this.light.getBrightness());
    }

    @Override
    public void revert() {
        this.light.switchPower(false);
    }

}
