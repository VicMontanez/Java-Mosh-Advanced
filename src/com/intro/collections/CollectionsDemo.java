package com.intro.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show () {
        Collection<String> collection = new ArrayList<> ();
        Collections.addAll(collection, "a", "b", "c");
        collection.clear();
        System.out.println(collection.isEmpty());
        }
    }

