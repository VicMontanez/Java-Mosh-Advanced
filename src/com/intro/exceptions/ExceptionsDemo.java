package com.intro.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        catch (IOException e ) {
            System.out.println("Could not read data.");
        }

    }
}
