package commandpattern;

import commandpattern.invoker.LightCommandInvoker;
import commandpattern.invoker.command.impl.DecreaseBrightnessCommand;
import commandpattern.invoker.command.impl.IncreaseBrightnessCommand;
import commandpattern.invoker.command.impl.LightsOffCommand;
import commandpattern.invoker.command.impl.LightsOnCommand;
import commandpattern.light.ILight;
import commandpattern.light.impl.Lamp;

public class CommandRunner {
    public static void main(String[] args) {
        ILight lamp = new Lamp();

        LightCommandInvoker invoker = new LightCommandInvoker(new LightsOnCommand(lamp), new LightsOffCommand(lamp),
                new IncreaseBrightnessCommand(lamp), new DecreaseBrightnessCommand(lamp));
        invoker.switchOn();
        invoker.increaseBrightness();
        invoker.increaseBrightness();
        invoker.increaseBrightness();
        invoker.decreaseBrightness();
        invoker.switchOff();
    }
}
