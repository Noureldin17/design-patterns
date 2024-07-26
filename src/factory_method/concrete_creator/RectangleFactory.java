package factory_method.concrete_creator;

import factory_method.concrete_product.Rectangle;
import factory_method.creator.ShapeFactory;
import factory_method.product.Shape;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
