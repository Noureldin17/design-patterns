package factory_method.concrete_product;

import factory_method.product.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
