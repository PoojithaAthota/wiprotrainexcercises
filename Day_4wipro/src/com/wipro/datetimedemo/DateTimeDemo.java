package com.wipro.datetimedemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        // Create a LocalDate for 1st November 2023
        LocalDate date = LocalDate.of(2023, 11, 1);

        // Define the desired format: dd-MM-yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Format and print the date
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
    }
}

