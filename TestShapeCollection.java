import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestShapeCollection {
    @Test
    public void testEmptyCollection() {
        // Given
        ShapeCollection ShapeCollection = new ShapeCollection();
        // When
        double totalArea = ShapeCollection.getTotalArea();
        double totalNumberOfShapes = ShapeCollection.getNumberOfShapes();
        // Then
        // The number of shapes and the total area are both 0 since no shapes were added to the collection
        int ExpectedNumberOfShapes = 0;
        double ExpectedTotalArea = 0;
        
        assertEquals(ExpectedNumberOfShapes, totalNumberOfShapes, 0.001, "The total number of shapes shoulb be 0");
        assertEquals(ExpectedTotalArea, totalArea, 0.001, "The total area should be 0");
    }

    @Test
    public void testSingleRectangle() {
        // Given
        ShapeCollection ShapeCollection = new ShapeCollection();
        // When
        ShapeCollection.addShape(new Rectangle(2.0,4.0));
        double totalArea = ShapeCollection.getTotalArea();
        double totalNumberOfShapes = ShapeCollection.getNumberOfShapes();
        // Then
        // Calculating the total area of the shapes in the collection
        // The only shape in the collection is a Rectangle with: width = 2 and height = 4
        // The rectangles area is 2*4 = 8
        double RectangleArea = 2*4;
        // The number of shapes are 1 since there is only one shape in the collection
        int ExpectedNumberOfShapes = 1;
        double ExpectedTotalArea = RectangleArea;

        assertEquals(ExpectedNumberOfShapes, totalNumberOfShapes, 0.001, "The total number of shapes shoulb be 1");
        assertEquals(ExpectedTotalArea, totalArea, 0.001, "The total area should be 2*4 = 8");
    }

    @Test
    public void testNegativeTotalArea() {
        // Given
        ShapeCollection ShapeCollection = new ShapeCollection();
        // When
        ShapeCollection.addShape(new Rectangle(-10.0,4.0));
        ShapeCollection.addShape(new Circle(1.5));
        ShapeCollection.addShape(new Square(2.0));
        double totalArea = ShapeCollection.getTotalArea();
        double totalNumberOfShapes = ShapeCollection.getNumberOfShapes();
        // Then
        // Calculating the total area of the shapes in the collection
        // The only shape in the collection is a Rectangle with: width = 2 and height = 4
        // The rectangles area is 10*4 = -40
        double RectangleArea = -10*4;
        // The Circles area is 1.5*1.5*PI = 7,0686...
        double CircleArea = 1.5*1.5*Math.PI;
        // The squares area is 2.0*2.0 = 4
        double SquareArea = 2.0*2.0;
        // The number of shapes are 1 since there is only one shape in the collection
        int ExpectedNumberOfShapes = 3;
        double ExpectedTotalArea = RectangleArea+CircleArea+SquareArea;

        assertEquals(ExpectedNumberOfShapes, totalNumberOfShapes, 0.001, "The total number of shapes should be 3");
        assertEquals(ExpectedTotalArea, totalArea, 0.001, "The total area should be -40+7,0686...+4 = -28,931... ");
    }

    @Test
    public void testmultipleShapes() {
        // Given
        ShapeCollection ShapeCollection = new ShapeCollection();
        // When
        ShapeCollection.addShape(new Rectangle(10.0,4.0));
        ShapeCollection.addShape(new Circle(1.5));
        ShapeCollection.addShape(new Square(2.0));
        double totalArea = ShapeCollection.getTotalArea();
        double totalNumberOfShapes = ShapeCollection.getNumberOfShapes();
        // Then
        // Calculating the total area of the shapes in the collection
        // The only shape in the collection is a Rectangle with: width = 2 and height = 4
        // The rectangles area is 10*4 = 40
        double RectangleArea = 10*4;
        // The Circles area is 1.5*1.5*PI = 7,0686...
        double CircleArea = 1.5*1.5*Math.PI;
        // The squares area is 2.0*2.0 = 4
        double SquareArea = 2.0*2.0;
        // The number of shapes are 1 since there is only one shape in the collection
        int ExpectedNumberOfShapes = 3;
        double ExpectedTotalArea = RectangleArea+CircleArea+SquareArea;

        assertEquals(ExpectedNumberOfShapes, totalNumberOfShapes, 0.001, "The total number of shapes should be 3");
        assertEquals(ExpectedTotalArea, totalArea, 0.001, "The total area should be 40+7,0686...+4 = 51,0686... ");
    }
}
