package strategypattern.strategies.flying.impl;

import strategypattern.strategies.flying.FlyingStrategy;

public class WingFlying implements FlyingStrategy {

    @Override
    public void fly() {
        System.out.println("You hear wings flapping");
    }
    
}
