package abs_factory.concrete_product;

import abs_factory.abs_product.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Checkbox in windows style");
    }
}
