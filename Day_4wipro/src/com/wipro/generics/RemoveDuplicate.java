package com.wipro.generics;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate{
    public static void main(String[] args) {
        
        List<String> lang = new ArrayList<>();
        lang.add("Java");
        lang.add("C");
        lang.add("Python");
        lang.add("Java");
        lang.add("C");
        lang.add("Spring");

        System.out.println("Original List: " + lang);

        
        Set<String> uniqueLangs = new LinkedHashSet<>(lang); 

        
        List<String> listWithoutDuplicates = new ArrayList<>(uniqueLangs);

        System.out.println("New List: " + listWithoutDuplicates);
    }
}

