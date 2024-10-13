import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTriangle {
    @Test
    public void testSomeTriangle() {

        //Värden
        double height = 3.00;
        double width = 4.00;

        //Ny triangel
        Triangle triangle = new Triangle(width, height);

        //Räknar arena
        double area = triangle.getArea(); 

        //Vad det borde vara 
        double ExpectedArea = 6.00; 

        //Kollar om det är rätt
        assertEquals(ExpectedArea, area, 0.001, "Area should be 6");

    }

    @Test
    public void testSomeOtherTriangle() {

        //Värden
        double height = 5.00;
        double width = 5.00;

        //Skapar en ny traingel
        Triangle triangle = new Triangle(width, height);

        //Räknar ut arean
        double area = triangle.getArea(); 

        //Vad arean borde vara 
        double ExpectedArea = 12.50; 

        //Kollar om det är fel 
        assertEquals(ExpectedArea, area, 0.001, "Area should be 12.5");
    }
}
