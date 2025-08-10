package com.wipro.oops;

public class Shape {
	String color;
	
	public Shape(String color) {
        this.color = color;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
        return "Color: " + color;
    }

}
