import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestShapeCollection {

    @Test
    public void isAllCircles(){

        // Given
        ShapeCollection shapeCollection = new ShapeCollection();
        Triangle triangle = new Triangle(5, 5);
        Circle circle = new Circle(5);

        // When 
        shapeCollection.addShape(circle);
        shapeCollection.addShape(triangle);

        // Then
        assertFalse(shapeCollection.isAllCircles());  

    //För att testa två olika scenarion med samma funktion

        //Given
        ShapeCollection circleOnlyCollection = new ShapeCollection();
        
        //When
        circleOnlyCollection.addShape(circle);
        circleOnlyCollection.addShape(new Circle(10));

        // Then
        assertTrue(circleOnlyCollection.isAllCircles());
    }

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

    // TODO: Vilka fler tester behövs?
    // Lägg till minst två metoder som testar vanliga situationer med ShapeCollection.
}