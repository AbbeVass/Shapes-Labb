import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSphere {
    @Test
    public void testSphereGetDiameter() {
        // Given
        double diameter = 5.45;
        Sphere sphere = new Sphere(diameter);

        // When
        double givenDiameter = sphere.getDiameter();

        // Then
        // The given diameter is expected to be the same as diameter
        assertEquals(diameter, givenDiameter, 0, "The diameter should be 5.45");
    }

    @Test
    public void testSphereGetRadius() {
        // Given
        double diameter = 5.45;
        Sphere sphere = new Sphere(diameter);

        // When
        double radius = sphere.getRadius();

        // Then
        // The radius is expected to be half the diameter
        double expectedRadius = diameter / 2;
        assertEquals(expectedRadius, radius, 0.001, "The radius should be 2.725");
    }

    @Test
    public void testSphereGetVolumePositive() {
        // Given
        double diameter = 101;
        Sphere sphere = new Sphere(diameter);

        // When
        double volume = sphere.getVolume();

        // Then
        // Expected volume calculation:
        // (4 * π * (101 / 2)^3) / 3 ≈ 539464.3421
        double expectedVolume = 539464.3421;
        assertEquals(expectedVolume, volume, 0.001, "The volume should be 539464.3421");
    }

    @Test
    public void testSphereGetVolumeNegative() {
        // Given
        double diameter = -12;
        Sphere sphere = new Sphere(diameter);

        // When
        double volume = sphere.getVolume();

        // Then
        // Expected volume calculation:
        // (4 * π * (-12 / 2)^3) / 3 ≈ -904.7786842
        double expectedVolume = -904.7786842;
        assertEquals(expectedVolume, volume, 0.001, "The volume should be -904.7786842");
    }

    @Test
    public void testSphereGetVolumeZero() {
        // Given
        double diameter = 0;
        Sphere sphere = new Sphere(diameter);

        // When
        double volume = sphere.getVolume();

        // Then
        // Expected volume calculation:
        // (4 * π * (0 / 2)^3) / 3 = 0
        double expectedVolume = 0;
        assertEquals(expectedVolume, volume, 0, "The volume should be 0");
    }
}
