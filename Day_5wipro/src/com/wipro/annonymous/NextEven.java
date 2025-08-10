package com.wipro.annonymous;

import java.util.function.Consumer;

public class NextEven {
    public static void main(String[] args) {
        
        Consumer<Integer> NextEven = n -> {
            int nextEven = (n % 2 == 0) ? n + 2 : n + 1;
            System.out.println("Next even number: " + nextEven);
        };

        NextEven.accept(5);    
        NextEven.accept(100); 
    }
}

