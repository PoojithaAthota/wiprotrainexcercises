package com.wipro.exceptiontest;

import com.wipro.exception.InvalidMonthException;

public class MonthTest {

    public static void checkMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        } 
        else {
            System.out.println("Valid month: " + month);
        }
    }

    public static void main(String[] args) {
        int inputMonth = 20;  

        try {
            checkMonth(inputMonth);
        } catch (InvalidMonthException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
