package com.wipro.datetimedemo;

import java.time.LocalDate;

public class LeapYear {

    public static void main(String[] args) {
        
        LocalDate date = LocalDate.of(2024, 2, 29);

       
        int year = date.getYear();

        
        boolean isLeap = isLeapYear(year);

        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

