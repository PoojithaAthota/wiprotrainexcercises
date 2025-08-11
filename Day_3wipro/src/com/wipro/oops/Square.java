package com.wipro.oops;

public class Square extends Shape {
    double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public String toString() {
        return "Square [Side: " + side + ", " + super.toString() + "]";
    }

}
