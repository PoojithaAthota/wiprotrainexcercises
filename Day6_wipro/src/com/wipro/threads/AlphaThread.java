package com.wipro.threads;


public class AlphaThread {

	public void start() {
		// TODO Auto-generated method stub
		for (char c = 'A'; c <= 'J'; c++) {
	        System.out.println("Number : " + c +" Thread is running");
	        try {
	            Thread.sleep(1000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
		
	}
}
