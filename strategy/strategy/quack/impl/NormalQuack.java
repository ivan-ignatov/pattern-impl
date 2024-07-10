package strategy.quack.impl;

import strategy.quack.QuackStrategy;

public class NormalQuack implements QuackStrategy{

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
    
}
