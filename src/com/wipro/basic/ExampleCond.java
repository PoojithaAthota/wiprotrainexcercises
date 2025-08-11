package com.wipro.basic;

public class ExampleCond {
	public static void main(String[] args) {
		double num1 = 155.8557;
	    double num2 = 155.855;

	    long r1 = Math.round(num1 * 1000);
	    long r2 = Math.round(num2 * 1000);

	    System.out.println("First number : " + num1);
	    System.out.println("Second number: " + num2);

	    if (r1 == r2) {
	         System.out.println("They are the same up to three decimal places");
	    } 
	    else {
	            System.out.println("They are different");
	    }
	}
}

