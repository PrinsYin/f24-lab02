package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(2);
        Shape square = new Square(2);
        
        Renderer renderer = new Renderer(circle);
        Renderer renderer2 = new Renderer(square);
        Renderer renderer3 = new Renderer(rectangle);
        renderer.draw();
        renderer2.draw();
        renderer3.draw();
    }
}
