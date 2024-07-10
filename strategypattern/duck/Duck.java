package strategypattern.duck;

import strategypattern.strategy.display.DisplayStrategy;
import strategypattern.strategy.fly.FlyStrategy;
import strategypattern.strategy.quack.QuackStrategy;

public class Duck {

    DisplayStrategy displayInterface;
    FlyStrategy flyInterface;
    QuackStrategy quackInterface;
    
    public Duck(DisplayStrategy displayInterface, FlyStrategy flyInterface, QuackStrategy quackInterface) {
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