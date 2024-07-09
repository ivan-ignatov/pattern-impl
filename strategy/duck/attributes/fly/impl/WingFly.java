package duck.attributes.fly.impl;

import duck.attributes.fly.FlyInterface;

public class WingFly implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("You hear wings flapping");
    }
    
}
