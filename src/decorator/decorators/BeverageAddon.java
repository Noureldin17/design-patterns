package decorator.decorators;

import decorator.component.Beverage;

public abstract class BeverageAddon implements Beverage {
    protected Beverage beverage;

    public BeverageAddon(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
