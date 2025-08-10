package com.wipro.collectors;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.Comparator;


public class FoodItemsDemo {
    public static void main(String[] args) {

        FoodItem f1 = new FoodItem("Spring Rolls", "Veg", "Chinese", 50);
        FoodItem f2 = new FoodItem("Chinese Noodles", "Veg", "Thai", 250);
        FoodItem f3 = new FoodItem("Grilled Chicken", "Non Veg", "Continental", 150);
        FoodItem f4 = new FoodItem("Veg Manchurian", "Veg", "Chinese", 100);
        

        List<FoodItem> foodList = new ArrayList<>();
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);
        foodList.add(f4);
        
        
        foodList.stream()
                .filter(d -> d.cuisine.equals("Chinese"))
                .max(Comparator.comparing(d -> d.price))
                .ifPresent(System.out::println);
        
//                .filter(f -> f.cuisine.equalsIgnoreCase("Chinese"))
//                .collect(Collectors.toList());
        

        // System.out.println("Chinese Food Items:");
        // System.out.println(chineseList);
    }
}


