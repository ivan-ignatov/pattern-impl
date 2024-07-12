package decoratorpattern.component.coffee;

import decoratorpattern.component.Beverage;

public class Espresso extends Beverage {

    private String name;
    private Double price;

    public Espresso() {
        this.name = "Espresso";
        this.price = 1.50;
    }

    @Override
    public Double cost() {
        return price;
    }

    @Override
    public String name() {
        return this.name;
    }
}
