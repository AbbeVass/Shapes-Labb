import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSquare {
    @Test
    public void testSquareGetSide() {
        // Given
        double side = 5.45;
        Square square = new Square(side);

        // When
        double givenSide = square.getSide();

        // Then
        // The given side is expected to be the same as side
        assertEquals(side, givenSide, 0);
    }

    @Test
    public void TestSquareGetArea1() {
        // Given
        double side = 1;
        Square square = new Square(side);

        // When
        double area = square.getArea();

        // Then
        // Expected area calculation
        // 1 * 1 = 1
        double expectedArea = 1;
        assertEquals(expectedArea, area, 0.001, "Area should be 1");
    }

    @Test
    public void TestSquareGetArea2() {
        // Given
        double side = -5.1;
        Square square = new Square(side);

        // When
        double area = square.getArea();

        // Then
        // Expected area calculation
        // -5.1 * -5.1 = 26.01
        double expectedArea = 26.01;
        assertEquals(expectedArea, area, 0.001, "Area should be 26.01");
    }

    @Test
    public void TestSquareGetArea3() {
        // Given
        double side = 0;
        Square square = new Square(side);

        // When
        double area = square.getArea();

        // Then
        // Expected area calculation
        // 0 * 0 = 0
        double expectedArea = 0;
        assertEquals(expectedArea, area, 0.001, "Area should be 0");
    }
}
