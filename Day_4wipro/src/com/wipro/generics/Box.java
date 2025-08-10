package com.wipro.generics;

public class Box<T> {
    T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}



