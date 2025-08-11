package com.wipro.collectors;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;

class FoodItem {
    public String foodName;
    public String foodType;
    public String cuisine;
    public double price;

    public FoodItem(String foodName, String foodType, String cuisine, double price) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.cuisine = cuisine;
        this.price = price;
    }
    
    @Override
	public String toString() {
		return " " + foodName + "-" +" "+ foodType + "-" + " " + cuisine + "- " + ""+ price;
	}
}  
