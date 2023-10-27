package edu.geometry;

public class Triangle extends Shape{
    private final double base;
    private final double height;


    public Triangle(double base, double height) {

        this.base = base;
        this.height = height;
    }

    public double area() {
        return (height * base) / 2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }


}
