package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    public double height;
    public double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
    public int getShape()
    {
        return 1;
    }

    public double[] getSize()
    {
        return new double[]{height,width};
    }

}
