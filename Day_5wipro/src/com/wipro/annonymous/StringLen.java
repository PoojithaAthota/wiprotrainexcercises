package com.wipro.annonymous;

import java.util.*;
import java.util.function.Function;

public class StringLen{
    public static void main(String[] args) {
    	
        Function<List<String>, List<Integer>> strLength = list -> {
            List<Integer> result = new ArrayList<>();
            for (String str : list) {
                result.add(str.length());
            }
            return result;
        };

        List<String> input = Arrays.asList("Jayanta", "Amit", "Vasu");
        System.out.println(strLength.apply(input));  
    }
}
