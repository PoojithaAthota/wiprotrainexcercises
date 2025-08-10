package com.wipro.annonymous;

public class MultiplyDemo {
    public static void main(String[] args) {
        
        Multiply mul = (a, b) -> { return a * b; };

        
        int result = mul.multiply(10, 7);

        
        System.out.println("Multiplication : " + result);
    }
}
