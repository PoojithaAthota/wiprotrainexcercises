package com.wipro.basic;

public class Conditional {
	public static void main(String[] args) {
		
//		char shape ='S';
//		if(shape=='R') {
//			System.out.println("Rectangle");
//		}
//		else if (shape=='S') {
//				System.out.println("Square");		
//		}
//		else if (shape=='C') {
//			System.out.println("Circle");		
//	    }
//		else {
//				System.out.println("Other");		
//		}
		
// --------------------------------------------S W I T C H-------------------------------------------------------	
		
		
		char gender ='M';
		
		switch(gender) {
		case 'M':
			System.out.println("Male");		
		case 'F':
			System.out.println("Female");
		case 'O':
			System.out.println("Other");
		default:
			System.out.println("Unknown");	
		}
	}
}




