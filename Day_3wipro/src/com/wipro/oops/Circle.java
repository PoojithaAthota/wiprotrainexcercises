package com.wipro.oops;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public String toString() {
        return "Circle [Radius: " + radius + ", " + super.toString() + "]";
    } 

}
