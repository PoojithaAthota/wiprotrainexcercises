package com.wipro.oops;

public class Bird extends Animal {
    public Bird(String food) {
        super(food);
    }

    public void makeSound() {
        System.out.println("Bird says: Tweet");
    }
}

