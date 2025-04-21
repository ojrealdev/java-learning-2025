package main.java.exeptions;

import java.io.File;
import java.io.IOException;

public class ExeptionHandling {

    public static void main(String[] args) {
        File file = new File("resources/non-existent.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Error Creating file: " +" Message: " + e.getMessage());
        }
    }
}
