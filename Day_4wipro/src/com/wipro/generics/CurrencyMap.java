package com.wipro.generics;

import java.util.*;

public class CurrencyMap {
    public static void main(String[] args) {
        
        Map<String, String> currMap = new TreeMap<>();

        currMap.put("USD", "United States Dollar");
        currMap.put("INR", "Indian Rupee");
        currMap.put("EUR", "Euro");

        System.out.println("Sorted List:");
        for (Map.Entry<String, String> entry : currMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}


