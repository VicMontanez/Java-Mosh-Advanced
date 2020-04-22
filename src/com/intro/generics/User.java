package com.intro.generics;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User user) {
        return 0;
    }

    @Override
    public String toString() {
        return "Points=" + points;
    }


}
