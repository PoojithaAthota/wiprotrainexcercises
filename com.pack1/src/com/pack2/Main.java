package com.pack2;
import java.util.Scanner;
public class Main{
	public void swaptwo() {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swapping: a value " + a + " and b value is " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: a value " + a + " and b value is " + b);
			
}
public static void main(String[]args) {
	 Main obj=new Main();
	 obj.swaptwo();
}

	
}
