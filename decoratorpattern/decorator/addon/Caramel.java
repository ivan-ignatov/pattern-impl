package decoratorpattern.decorator.addon;

import decoratorpattern.component.Beverage;
import decoratorpattern.decorator.AddonDecorator;

public class Caramel extends AddonDecorator {

    private Beverage beverage;

    private Double price;
    private String name;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
        this.name = "Caramel";
        this.price = 1.25;
    }

    @Override
    public Double cost() {
        System.out.println("Adding caramel to " + beverage.name());
        return this.beverage.cost() + this.price;
    }

    @Override
    public String name() {
        return this.name;
    }
    
}
