package factory_method.concrete_creator;

import factory_method.concrete_product.Square;
import factory_method.creator.ShapeFactory;
import factory_method.product.Shape;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
