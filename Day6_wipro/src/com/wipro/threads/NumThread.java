package com.wipro.threads;

public class NumThread {
	
	public void start() {
	
	for (int i = 1; i <= 10; i++) {
        System.out.println("Number : " + i +" Thread is running");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
}
