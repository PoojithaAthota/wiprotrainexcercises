package com.wipro.collectors;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
    	Optional<Integer> optionalInt = Optional.ofNullable(null);
    	optionalInt.ifPresentOrElse(
    	            value -> System.out.println("Value is: " + value),
    	            () -> System.out.println("No value present")
    	        );

        
        
    }
}
