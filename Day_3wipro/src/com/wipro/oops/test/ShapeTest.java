package com.wipro.oops.test;

import com.wipro.oops.Circle;
import com.wipro.oops.Rectangle;
import com.wipro.oops.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5.0);
        Rectangle r = new Rectangle("Blue", 4.0, 6.0);
        Square s = new Square("Green", 3.0);

        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
    }
}


