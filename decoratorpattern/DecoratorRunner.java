package decoratorpattern;

import decoratorpattern.component.Beverage;
import decoratorpattern.component.coffee.Espresso;
import decoratorpattern.decorator.addon.Caramel;

public class DecoratorRunner {
    
    public static void main(String[] args) {
        Beverage caramelEspresso = new Caramel(new Espresso());

        System.out.println("Total cost for Espresso with Caramel: " + caramelEspresso.cost());
    }
}
