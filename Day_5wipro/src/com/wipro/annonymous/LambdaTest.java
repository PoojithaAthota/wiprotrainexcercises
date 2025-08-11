package com.wipro.annonymous;

public class LambdaTest {
    public static void main(String[] args) {
        
        Greeting greet = () -> System.out.println("Hello Lambda");

        greet.sayHello();
    }
}
