import factory_method.concrete_creator.CircleFactory;
import factory_method.concrete_creator.SquareFactory;
import factory_method.creator.ShapeFactory;
import factory_method.product.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory sqFactory = new SquareFactory();
        Shape square = sqFactory.createShape();
        square.draw();
    }
}