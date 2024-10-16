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

    public boolean isAllCircles() {
        // Kontrollera om alla objekt i listan är av typen Circle
        for (Shape2D shape : shapes) {
            
            // Om någon form inte är en Circle, returnera false
            if (!(shape instanceof Circle)) {
                return false;  
            }
        }
        return true;  // Alla former är cirklar
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape2D shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}