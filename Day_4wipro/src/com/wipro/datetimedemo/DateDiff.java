package com.wipro.datetimedemo;

import java.time.LocalDate;


public class DateDiff {

    public static void getDateDiff(LocalDate dt1, LocalDate dt2) {
        
        if (dt1.isAfter(dt2)) {
            LocalDate temp = dt1;
            dt1 = dt2;
            dt2 = temp;
        }

        int years = dt2.getYear() - dt1.getYear();
        int months = dt2.getMonthValue() - dt1.getMonthValue();
        int days = dt2.getDayOfMonth() - dt1.getDayOfMonth();
        System.out.println("Difference is: " + years + " years, " + months + " months, " + days + " days");
    }
        
        public static void main(String[] args) {
            LocalDate date1 = LocalDate.of(2023, 11, 02);
            LocalDate date2 = LocalDate.of(2024, 01, 10);

            getDateDiff(date1, date2);
            
        }  
    }        
