package strategypattern.strategies.quacking.impl;

import strategypattern.strategies.quacking.QuackingStrategy;

public class NormalQuacking implements QuackingStrategy{

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
    
}
