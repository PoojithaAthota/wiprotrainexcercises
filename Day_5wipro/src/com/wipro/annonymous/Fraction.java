package com.wipro.annonymous;

import java.util.function.Function;

public class Fraction {
    public static void main(String[] args) {
        Function<Double, Double> fractionPart = d -> Math.round((d % 1) * 100.0) / 100.0;

        System.out.println(fractionPart.apply(123.45));  
    }
}

