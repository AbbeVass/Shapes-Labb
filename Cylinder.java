public class Cylinder extends Shape3D{
    private double diameter;
    private double height;

    public Cylinder(double diameter, double height) {
        this.diameter = diameter;
        this.height = height;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return getDiameter()/2;
    }

    @Override
    public double getVolume() {
        double volume = (getRadius() * getRadius()) * Math.PI * getHeight();
        return volume;
    }
}
