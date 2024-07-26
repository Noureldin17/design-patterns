package abs_factory.concrete_factory;

import abs_factory.abs_factory.GUIFactory;
import abs_factory.abs_product.Button;
import abs_factory.abs_product.Checkbox;
import abs_factory.concrete_product.WindowsButton;
import abs_factory.concrete_product.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
