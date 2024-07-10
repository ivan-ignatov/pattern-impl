package attributes.fly.impl;

import attributes.fly.FlyInterface;

public class WingFly implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("You hear wings flapping");
    }
    
}
