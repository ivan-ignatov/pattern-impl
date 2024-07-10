package attributes.quack.impl;

import attributes.quack.QuackInterface;

public class NormalQuack implements QuackInterface{

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
    
}
