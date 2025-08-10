package com.wipro.threads;

public class Counter {
    public int count = 0;

    public synchronized void increment() {
        count++;
    }
}
