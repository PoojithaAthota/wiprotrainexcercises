package com.wipro.oops;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle [Length: " + length + ", Width: " + width + ", " + super.toString() + "]";
    } 

}
