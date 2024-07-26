package abs_factory.concrete_factory;

import abs_factory.abs_factory.GUIFactory;
import abs_factory.abs_product.Button;
import abs_factory.abs_product.Checkbox;
import abs_factory.concrete_product.MacOSButton;
import abs_factory.concrete_product.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
