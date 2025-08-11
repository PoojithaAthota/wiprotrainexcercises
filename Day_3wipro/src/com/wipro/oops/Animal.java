package com.wipro.oops;

public abstract class Animal {
    String food;

    public Animal(String food) {
        this.food = food;
    }

    public abstract void makeSound();

    public void showFood() {
        System.out.println("Eats: " + food);
    }
}


