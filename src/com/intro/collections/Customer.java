package com.intro.collections;

public class Customer implements Comparable<Customer>{
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer customer) {
        return 0;
    }
}
