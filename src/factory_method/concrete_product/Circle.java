package factory_method.concrete_product;

import factory_method.product.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
