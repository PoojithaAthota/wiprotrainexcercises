package com.wipro.oops.test;

import com.wipro.oops.Converter;

public class ConverterTest {
	public static void main (String[] args) {
		Converter c = new Converter();
		
		int sub = c.convert(10);
		int result = c.convert(5,9);
		double res = c.convert(3.5);
		
		System.out.println("Subtraction :"+sub);
		System.out.println("Addition :"+result);
		System.out.println("Multiplication :"+res);
		
	}

}
