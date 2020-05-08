package com.intro.lambdas;

public class LambdasDemo {
    public static  void print(String message) {}
    //public String prefix = "-";
    public void show() {
        greet(message -> print(message));
//        greet(message ->
//            System.out.println(message));
//
//        // Class/Object::method
//        greet(System.out::println);

        //Printer printer = message -> System.out.println(message);

    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
