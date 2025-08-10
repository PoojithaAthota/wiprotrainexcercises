package com.wipro.genericstest;

import com.wipro.generics.Box;

public class TestBox {
    public static void main(String[] args) {
        Box<String> name = new Box<>();
        name.add("Welcome");
        System.out.println("String: " + name.get());

        Box<Integer> num = new Box<>();
        num.add(100);
        System.out.println("Integer: " + num.get());
    }
}
