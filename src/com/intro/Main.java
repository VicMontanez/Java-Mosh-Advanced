package com.intro;



import com.intro.generics.Instructor;
import com.intro.generics.User;
import com.intro.generics.Utils;


public class Main {
    public static void main(String[] args) {
        User user = new Instructor(10);
        Utils.printUser(new Instructor(10));

    }
}
