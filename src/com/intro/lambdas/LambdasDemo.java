package com.intro.lambdas;

public class LambdasDemo {
    public String prefix = "-";
    public void show() {
        greet(message ->
            System.out.println(prefix + message));

        //Printer printer = message -> System.out.println(message);

    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
