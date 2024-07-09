import duck.Duck;
import duck.attributes.display.impl.GraphicDisplay;
import duck.attributes.fly.impl.WingFly;
import duck.attributes.quack.impl.NormalQuack;

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
