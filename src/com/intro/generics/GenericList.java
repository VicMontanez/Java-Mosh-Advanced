package com.intro.generics;

public class GenericList<T extends Comparable & Cloneable> {
    public T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
