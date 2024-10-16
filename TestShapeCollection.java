import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestShapeCollection {
    @Test
    public void testEmptyCollection() {

        //Given
        ShapeCollection shape = new ShapeCollection();

        //When 
        int NumberOfShapes = shape.getNumberOfShapes();
        
        //Then 
            assertEquals(0,NumberOfShapes, "Number of shapes should be 0");

        
    }

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
    public void testSingleRectangle() {
        //Given
        ShapeCollection singleRectangle = new ShapeCollection();
        Rectangle rectangle = new Rectangle (5, 5);

        //When 
        singleRectangle.addShape(rectangle);
        int NumberOfRectangles = singleRectangle.getNumberOfShapes();

        //Then 
        assertEquals(1, NumberOfRectangles, "There should only be 1 rectangle");
        
    }

    // TODO: Vilka fler tester behövs?
    // Lägg till minst två metoder som testar vanliga situationer med ShapeCollection.
}
