package decorator.concrete_decorators;

import decorator.component.Beverage;
import decorator.decorators.BeverageAddon;

public class MilkAddon extends BeverageAddon {
    public MilkAddon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.99;
    }
}
