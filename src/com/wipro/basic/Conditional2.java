//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
//Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
//or "large" if it exceeds 1,000,000.
//Test Data
//Input a number: 25
//Expected Output :
//Input value: 25
//Positive number

package com.wipro.basic;

public class Conditional2 {

	public static void main(String[] args) {
		
		double num =-0.5;
		
		if(num==0){ 
			System.out.println("Zero");
		}
		else if(num>0) {
			System.out.println("Positive");
		}
		else{
			System.out.println("negative");
		}
		
		double abss = Math.abs(num);
		if(abss<1) {
			System.out.println("small");
		}
		else if(abss>1000000) {
			System.out.println("large");
		}


	}

}
