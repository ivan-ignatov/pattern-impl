package strategypattern.strategy.quack.impl;

import strategypattern.strategy.quack.QuackStrategy;

public class NormalQuack implements QuackStrategy{

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
    
}
