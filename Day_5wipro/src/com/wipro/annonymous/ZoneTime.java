package com.wipro.annonymous;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.function.Consumer;

public class ZoneTime {
    public static void main(String[] args) {
        
        Consumer<ZoneId> printTime = zone -> {
            ZonedDateTime time = ZonedDateTime.now(zone);
            System.out.println("Current time in " + zone + ": " + time.toLocalTime());
        };

        
        printTime.accept(ZoneId.of("Asia/Kolkata"));
    }
}

