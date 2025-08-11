package com.wipro.threads;

public class MyThread extends Thread {
	
	 public static void main(String [] args) {
		 NumThread num = new NumThread();
		 AlphaThread alpha = new AlphaThread();
		 
		 num.start();
		 alpha.start();
	 }
}
