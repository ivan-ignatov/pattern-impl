import duck.Duck;
import strategy.display.impl.GraphicDisplay;
import strategy.fly.impl.WingFly;
import strategy.quack.impl.NormalQuack;

public class RunnerClass {
    public static void main(String[] args) {
        GraphicDisplay graphicDisplay = new GraphicDisplay();
        WingFly wingFly = new WingFly();
        NormalQuack normalQuack = new NormalQuack();

        Duck duck = new Duck(graphicDisplay, wingFly, normalQuack);

        duck.display();
        duck.fly();
        duck.quack();
    } 
}
