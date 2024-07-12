package strategypattern;

import strategypattern.duck.Duck;
import strategypattern.strategies.displaying.impl.GraphicDisplaying;
import strategypattern.strategies.flying.impl.WingFlying;
import strategypattern.strategies.quacking.impl.NormalQuacking;

public class StrategyRunner {
    
    public static void main(String[] args) {
        GraphicDisplaying graphicDisplay = new GraphicDisplaying();
        WingFlying wingFly = new WingFlying();
        NormalQuacking normalQuack = new NormalQuacking();

        Duck cityDuck = new Duck(graphicDisplay, wingFly, normalQuack);

        cityDuck.display();
        cityDuck.fly();
        cityDuck.quack();
    } 
}
