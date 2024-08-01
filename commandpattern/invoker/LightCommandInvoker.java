package commandpattern.invoker;

import java.util.ArrayList;
import java.util.List;

import commandpattern.invoker.command.ICommand;

public class LightCommandInvoker {

    private ICommand switchOn;
    private ICommand switchOff;
    private ICommand increaseBrightness;
    private ICommand decreaseBrightness;

    public LightCommandInvoker(ICommand on, ICommand off, ICommand up, ICommand down) {
        this.switchOn = on;
        this.switchOff = off;
        this.increaseBrightness = up;
        this.decreaseBrightness = down;
    }

    public void switchOn() {
        this.switchOn.execute();
    }

    public void switchOff() {
        this.switchOff.execute();
    }

    public void increaseBrightness() {
        this.increaseBrightness.execute();
    }

    public void decreaseBrightness() {
        this.decreaseBrightness.execute();
    }
}
