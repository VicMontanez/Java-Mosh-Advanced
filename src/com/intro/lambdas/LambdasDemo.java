package com.intro.lambdas;

public class LambdasDemo {
    public void print(String message) {}
    //public String prefix = "-";
    public static void show() {
        var demo = new LambdasDemo();
        greet(demo::print);

    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
