import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRectangle {
    @Test
    public void testSomeRectangle() {
        // Given
        double width = 20.0;
        double height = 10.0;

        Rectangle rectangle = new Rectangle(width, height);
        // When
        double area = rectangle.getArea();

        // Then
        // Expected area calculation:
        // width = 20
        // Height = 10
        // Expected area = 10 * 20 = 200
        double expectedArea = 200.0; 
        assertEquals(expectedArea, area, 0.001, "Area should be 200cm");
    }

    @Test
    public void testSomeOtherRectangle() {
        // Given
        double width = 0.0;
        double height = 0.0;

        Rectangle rectangle = new Rectangle(width, height);
        // When
        double area = rectangle.getArea();

        // Then
        // Expected area calculation:
        // width = 0
        // Height = 0
        // Expected area = 0 * 0 = 0
        double expectedArea = 0.0; 
        assertEquals(expectedArea, area, 0.001, "This might work");
    }
    @Test
    public void testSomeOtherOtherRectangle() {
        // Given
        double width = -50.0;
        double height = -80.0;

        Rectangle rectangle = new Rectangle(width, height);
        // When
        double area = rectangle.getArea();

        // Then
        // Expected area calculation:
        // width = -50
        // Height = -80
        // Expected area = -50 * -80 = 4000
        double expectedArea = 4000.0; 
        assertEquals(expectedArea, area, 0.001, "This should work");
    }
    @Test
    public void testSomeOtherOtherOtherRectangle() {
        // Given
        double width = 50.0;
        double height = -80.0;

        Rectangle rectangle = new Rectangle(width, height);
        // When
        double area = rectangle.getArea();

        // Then
        // Expected area calculation:
        // width = 50
        // Height = -80
        // Expected area = 50 * -80 = -4000
        double expectedArea = -4000.0; 
        assertEquals(expectedArea, area, 0.001, "Expect this won't not work");
    }
}
