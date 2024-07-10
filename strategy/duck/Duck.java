package duck;
import attributes.display.DisplayInterface;
import attributes.fly.FlyInterface;
import attributes.quack.QuackInterface;

public class Duck {

    DisplayInterface displayInterface;
    FlyInterface flyInterface;
    QuackInterface quackInterface;
    
    public Duck(DisplayInterface displayInterface, FlyInterface flyInterface, QuackInterface quackInterface) {
        this.displayInterface = displayInterface;
        this.flyInterface = flyInterface;
        this.quackInterface = quackInterface;
    }

    public void display() {
        this.displayInterface.display();
    }
    
    public void fly() {
        this.flyInterface.fly();
    }

    public void quack() {
        this.quackInterface.quack();
    }
}