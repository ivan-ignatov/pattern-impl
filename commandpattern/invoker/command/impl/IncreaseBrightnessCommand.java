package commandpattern.invoker.command.impl;

import commandpattern.invoker.command.ICommand;
import commandpattern.light.ILight;

public class IncreaseBrightnessCommand implements ICommand {

    private ILight light;

    public IncreaseBrightnessCommand(ILight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        Integer currentBrightness = this.light.getBrightness();
        System.out.print("Light " + light.getName() + " brightness increased. ");
        this.light.setBrightness(currentBrightness + 10);
    }

    @Override
    public void revert() {
        Integer currentBrightness = this.light.getBrightness();
        this.light.setBrightness(currentBrightness - 10);
    }

}
