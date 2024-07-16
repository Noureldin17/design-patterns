package decorator.concrete_components;

import decorator.component.Beverage;

public class SimpleCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 2.33;
    }
}
