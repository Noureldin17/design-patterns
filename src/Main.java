import decorator.component.Beverage;
import decorator.concrete_components.SimpleCoffee;
import decorator.concrete_decorators.CaramelAddon;
import decorator.concrete_decorators.MilkAddon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new SimpleCoffee();
        beverage = new CaramelAddon(beverage);
        beverage = new CaramelAddon(beverage);
        beverage = new MilkAddon(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}