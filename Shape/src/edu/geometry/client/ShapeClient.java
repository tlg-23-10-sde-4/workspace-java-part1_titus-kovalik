package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(2.0, 5.0);
        shapes[2] = new Triangle(4,5);
        shapes[3] = new Rectangle(3,3);

        for (Shape shape : shapes) {
            System.out.printf("The area is %s\n", shape.area());
        }
    }
}