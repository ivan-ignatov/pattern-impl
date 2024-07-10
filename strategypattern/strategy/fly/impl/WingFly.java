package strategypattern.strategy.fly.impl;

import strategypattern.strategy.fly.FlyStrategy;

public class WingFly implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("You hear wings flapping");
    }
    
}
