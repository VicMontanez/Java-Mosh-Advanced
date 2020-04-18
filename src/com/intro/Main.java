package com.intro;


import com.intro.generics.GenericList;
import com.intro.generics.User;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<User>();
        list.add(new User());
        User user = list.get(0);

    }
}
