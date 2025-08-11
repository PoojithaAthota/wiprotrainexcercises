package com.wipro.collectors;

import java.util.*;

public class Average {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        int[] sum = {0};
        int[] count = {0};

        numbers.stream().forEach(n -> {
            sum[0] += n;
            count[0]++;
        });

        double average = count[0] == 0 ? 0 : (double) sum[0] / count[0];


        System.out.println("Average: " + average);
    }
}
