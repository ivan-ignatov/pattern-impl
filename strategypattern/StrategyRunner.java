package strategypattern;

import strategypattern.duck.Duck;
import strategypattern.strategy.display.impl.GraphicDisplay;
import strategypattern.strategy.fly.impl.WingFly;
import strategypattern.strategy.quack.impl.NormalQuack;

public class StrategyRunner {
    
    public static void main(String[] args) {
        GraphicDisplay graphicDisplay = new GraphicDisplay();
        WingFly wingFly = new WingFly();
        NormalQuack normalQuack = new NormalQuack();

        Duck cityDuck = new Duck(graphicDisplay, wingFly, normalQuack);

        cityDuck.display();
        cityDuck.fly();
        cityDuck.quack();
    } 
}
