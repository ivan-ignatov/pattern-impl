package decoratorpattern.decorator;

import decoratorpattern.component.Beverage;

public abstract class AddonDecorator extends Beverage {

    public abstract Double cost();
    public abstract String name();
}
