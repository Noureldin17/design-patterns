package abs_factory.concrete_product;

import abs_factory.abs_product.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Button in MacOS style");
    }
}
