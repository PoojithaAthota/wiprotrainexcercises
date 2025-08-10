package com.wipro.oops.test;

import com.wipro.oops.Animal;
import com.wipro.oops.Human;
import com.wipro.oops.Dog;
import com.wipro.oops.Bird;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Human("Rice");
        Animal a2 = new Dog("Bones");
        Animal a3 = new Bird("Seeds");

        a1.makeSound();
        a1.showFood();

        System.out.println();

        a2.makeSound();
        a2.showFood();

        System.out.println();

        a3.makeSound();
        a3.showFood();
    }
}
