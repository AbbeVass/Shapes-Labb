import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {
    private List<Shape2D> shapes = new ArrayList<>();

    public void addShape(Shape2D shape) {
        shapes.add(shape);
    }

    public int getNumberOfShapes() {
        return shapes.size();
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape2D shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}