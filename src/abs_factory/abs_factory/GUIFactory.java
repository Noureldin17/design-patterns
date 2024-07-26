package abs_factory.abs_factory;

import abs_factory.abs_product.Button;
import abs_factory.abs_product.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
