package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public ShapeType getShape()
    {
        return ShapeType.CIRCLE;
    }

    public double[] getSize()
    {
        return new double[]{radius};
    }

}
