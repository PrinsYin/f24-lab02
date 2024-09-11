package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(2);
        Shape square = new Square(2);
        
        Renderer renderer = new Renderer(circle);
        renderer = new Renderer(square);
        renderer = new Renderer(rectangle);
        renderer.draw();
    }
}
