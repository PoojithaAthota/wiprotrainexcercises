package com.wipro.annonymous;

import java.util.function.Predicate;

public class CheckCase {
    public static void main(String[] args) {
        String str1 = "POOJITHA";
        String str2 = "Pooji";
        
        Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());

        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());

        System.out.println(str1 + " is uppercase " + isUpperCase.test(str1));
        System.out.println(str2 + " is lowercase " + isLowerCase.test(str2));
    }
}

