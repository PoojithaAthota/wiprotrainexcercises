package com.wipro.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class Consecutive {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jayanta", "Jnanedra", "Vijay", "Poojitha", "Jagadeesh", "Jaya");

        List<String> result = names.stream()
            .filter(name -> name.toLowerCase().contains("ja"))
            .collect(Collectors.toList());

        System.out.println("Names with 'ja' consecutively: " + result);
    }
}

