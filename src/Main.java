import abs_factory.abs_factory.GUIFactory;
import abs_factory.abs_product.Button;
import abs_factory.abs_product.Checkbox;
import abs_factory.concrete_factory.WindowsFactory;
import factory_method.concrete_creator.CircleFactory;
import factory_method.concrete_creator.SquareFactory;
import factory_method.creator.ShapeFactory;
import factory_method.product.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        windowsCheckbox.paint();
        windowsButton.paint();
    }
}