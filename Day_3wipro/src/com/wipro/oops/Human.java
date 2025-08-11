package com.wipro.oops;

public class Human extends Animal {
    public Human(String food) {
        super(food);
    }

    public void makeSound() {
        System.out.println("Human says: Hello");
    }
}
