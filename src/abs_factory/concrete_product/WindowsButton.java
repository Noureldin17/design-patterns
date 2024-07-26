package abs_factory.concrete_product;

import abs_factory.abs_product.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Button in windows style");
    }
}
