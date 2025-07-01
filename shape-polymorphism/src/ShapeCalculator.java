import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {


    public static void main(String[] args) {
        Shape circle = new Circle(12);

        Rectangle square = new Rectangle();
        square.setDimensions(6);

        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(6, 9);


        Shape triangle = new Triangle(12, 10, 8);
        List<Shape> shapeArray = new ArrayList<Shape>();

        shapeArray.add(circle);
        shapeArray.add(square);
        shapeArray.add(rectangle);
        shapeArray.add(triangle);

        for (Shape s : shapeArray) {
            System.out.println("Shape " + s.getClass().getSimpleName() + " has Area " + s.calculateArea() + " Perimeter " + s.calculatePerimeter());
        }
    }
}
