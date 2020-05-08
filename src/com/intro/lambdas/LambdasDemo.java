package com.intro.lambdas;

import java.util.List;

public class LambdasDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3);

        //Imperative Programming
        for (var item : list)
            System.out.println(item);

        list.forEach(item -> System.out.println(item));
    }
}