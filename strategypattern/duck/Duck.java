package strategypattern.duck;

import strategypattern.strategies.displaying.DisplayingStrategy;
import strategypattern.strategies.flying.FlyingStrategy;
import strategypattern.strategies.quacking.QuackingStrategy;

public class Duck {

    DisplayingStrategy displayInterface;
    FlyingStrategy flyInterface;
    QuackingStrategy quackInterface;
    
    public Duck(DisplayingStrategy displayInterface, FlyingStrategy flyInterface, QuackingStrategy quackInterface) {
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