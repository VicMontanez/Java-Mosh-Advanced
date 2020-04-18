package com.intro.generics;

public class List {
    private Object[] items = new Object[10];
    private int count;

    public void add(int item) {
        items[count++] = item;
    }

    public int get (int index) {
        return items[index];
    }
}
