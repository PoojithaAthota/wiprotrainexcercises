package com.wipro.threads;

public class ConcurrentThread {
    public static void main(String[] args) {
        
        Thread numThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number : " + i +" Thread is running");
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        
        Thread alphaThread = new Thread(() -> {
            for (char c = 'A'; c <= 'J'; c++) {
                System.out.println("Letter: " + c +" Thread is running");
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        
        numThread.start();
        alphaThread.start();
    }
}

