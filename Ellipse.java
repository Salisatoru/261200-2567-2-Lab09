package ocp;

public class Ellipse extends Shape {
    private double semiMajorAxis, semiMinorAxis;

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public double calculateArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }
}
