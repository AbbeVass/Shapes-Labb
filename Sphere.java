public class Sphere extends Shape3D{
    private double diameter;

    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public double getRadius() {
        return getDiameter()/2;
    }

    @Override
    public double getVolume() {
        double volume = (4 * Math.PI * (getRadius() * getRadius() * getRadius()) / 3);
        return volume;
    }
}
