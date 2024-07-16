package decorator.concrete_decorators;

import decorator.component.Beverage;
import decorator.decorators.BeverageAddon;

public class CaramelAddon extends BeverageAddon {

    public CaramelAddon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Caramel";
    }

    @Override
    public double cost() {
        return super.cost() + 1.33;
    }
}
