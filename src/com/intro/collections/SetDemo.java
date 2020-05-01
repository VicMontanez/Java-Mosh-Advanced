package com.intro.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        //Union
        set1.addAll(set2);

        //System.out.println(set1);

        //Intersection - items common in both sets
        set1.retainAll(set2);

        System.out.println(set1);


    }
}
