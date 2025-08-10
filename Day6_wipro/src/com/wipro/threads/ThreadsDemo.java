package com.wipro.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ThreadsDemo extends Thread {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList("Amit", "Jayanta", "Poojitha", "Ashok", "Bhanu"));
	VowelsThread vowel = new VowelsThread();
	ConsonantsThread cons = new ConsonantsThread();
	
	Thread t1 = vowel.getThread(names);
	Thread t2 = cons.getThread(names);
	

    t1.start();
    t2.start();

    try {
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("Final Name List:");
    names.forEach(System.out::println);
}
}
	


