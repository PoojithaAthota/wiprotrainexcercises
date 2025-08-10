package com.wipro.annonymous;

import java.util.function.Predicate;

public class Palindrome{
    public static void main(String[] args) {
        
        Predicate<String> isPalindrome = str -> {
            
            return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
        };

        
        String input1 = "madam";
        String input2 = "hello";

        
        System.out.println(input1 + " is palindrome " + isPalindrome.test(input1) );
        System.out.println(input2 + " is palindrome " + isPalindrome.test(input2));
    }
}
