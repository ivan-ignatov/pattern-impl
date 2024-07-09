package duck.attributes.quack.impl;

import duck.attributes.quack.QuackInterface;

public class NormalQuack implements QuackInterface{

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
    
}
