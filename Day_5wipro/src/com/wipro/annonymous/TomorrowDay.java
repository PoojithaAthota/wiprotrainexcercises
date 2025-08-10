package com.wipro.annonymous;

import java.time.LocalDate;
import java.util.function.Supplier;

public class TomorrowDay {
    public static void main(String[] args) {
        Supplier<String> nextDay = () -> LocalDate.now().plusDays(1).getDayOfWeek().toString();

        System.out.println("Tomorrow is: " + nextDay.get());
    }
}

