import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCircle {
    @Test
    public void testZeroCircle() {
        // Given
        double radius = 0.0;
        Circle Circle = new Circle(radius);

        //  When
        double area = Circle.getArea();

        // Then
        // The expected area is:
        double ExpectedArea = Math.PI*0.0*0.0;
        assertEquals(ExpectedArea, area, 0.001, "Area should be 0");
    }

    @Test
    public void testPositiveCircle() {
        // Given
        double radius = 10.5;
        Circle Circle = new Circle(radius);

        //  When
        double area = Circle.getArea();

        // Then
        // The expected area is: 
        double ExpectedArea = Math.PI*10.5*10.5;
        assertEquals(ExpectedArea, area, 0.001, "Area should be 0");
    }

    @Test
    public void testNegativeCircle() {
        // Given
        double radius = -10.5;
        Circle Circle = new Circle(radius);

        //  When
        double area = Circle.getArea();

        // Then
        // The expected area is: 
        double ExpectedArea = Math.PI*-10.5*-10.5;
        assertEquals(ExpectedArea, area, 0.001, "Area should be 0");
    }
}
