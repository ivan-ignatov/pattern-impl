import duck.Duck;
import attributes.display.impl.GraphicDisplay;
import attributes.fly.impl.WingFly;
import attributes.quack.impl.NormalQuack;

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
