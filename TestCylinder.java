import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCylinder {
    @Test
    public void testCylinderGetDiameter() {
        // Given
        double diameter = 5.45;
        double height = 3.28;
        Cylinder cylinder = new Cylinder(diameter, height);

        // When
        double givenDiameter = cylinder.getDiameter();

        // Then
        // The given diameter is expected to be the same as diameter
        assertEquals(diameter, givenDiameter, 0, "The diameter should be 5.45");
    }

    @Test
    public void testCylinderGetHeight() {
        // Given
        double diameter = 5.45;
        double height = -3.28;
        Cylinder cylinder = new Cylinder(diameter, height);

        // When
        double givenHeight = cylinder.getHeight();

        // Then
        // The given height is expected to be the same as height
        assertEquals(height, givenHeight, 0, "The height should be -3.28");
    }

    @Test
    public void testCylinderGetRadius() {
        // Given
        double diameter = -5.45;
        double height = 3.28;
        Cylinder cylinder = new Cylinder(diameter, height);

        // When
        double radius = cylinder.getRadius();

        // Then
        // The radius is expected to be half the diameter
        double expectedRadius = diameter / 2;
        assertEquals(expectedRadius, radius, 0.001, "The radius should be -2.725");
    }

    @Test
    public void testCylinderGetVolumePositive() {
        // Given
        double diameter = 5.4;
        double height = 3.3;
        Cylinder cylinder = new Cylinder(diameter, height);

        // When
        double volume = cylinder.getVolume();

        // Then
        // Expected volume calculation:
        // π * (5.4 / 2)^2 * 3.3 ≈ 75.57729447
        double expectedVolume = 75.57729447;
        assertEquals(expectedVolume, volume, 0.001, "The volume should be 75.57729447");
    }
    
    @Test
    public void testCylinderGetVolumePartNegative() {
        // Given
        double diameter = -90;
        double height = 10.1;
        Cylinder cylinder = new Cylinder(diameter, height);

        // When
        double volume = cylinder.getVolume();

        // Then
        // Expected volume calculation:
        // π * (-90 / 2)^2 * 10.1 ≈ 64253.42375
        double expectedVolume = 64253.42375;
        assertEquals(expectedVolume, volume, 0.001, "The volume should be 64253.42375");
    }
    
    @Test
    public void testCylinderGetVolumeNegative() {
        // Given
        double diameter = -0.5;
        double height = -5;
        Cylinder cylinder = new Cylinder(diameter, height);

        // When
        double volume = cylinder.getVolume();

        // Then
        // Expected volume calculation:
        // π * (-0.5 / 2)^2 * -5 ≈ -0.9817477042
        double expectedVolume = -0.9817477042;
        assertEquals(expectedVolume, volume, 0.001, "The volume should be -0.9817477042");
    }
    
    @Test
    public void testCylinderGetVolumeZero() {
        // Given
        double diameter = 0;
        double height = 0;
        Cylinder cylinder = new Cylinder(diameter, height);

        // When
        double volume = cylinder.getVolume();

        // Then
        // Expected volume calculation:
        // π * (0 / 2)^2 * 0 = 0
        double expectedVolume = 0;
        assertEquals(expectedVolume, volume, 0, "The volume should be 0");
    }
}
