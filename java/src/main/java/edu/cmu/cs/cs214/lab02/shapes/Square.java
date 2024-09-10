package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    public double sideLen;

    public int getShape()
    {
        return 0;
    }

    public double[] getSize()
    {
        return new double[]{sideLen};
    }

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getArea() {
        return sideLen * sideLen;
    }
}
