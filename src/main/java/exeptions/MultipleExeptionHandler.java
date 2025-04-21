package main.java.exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExeptionHandler {
    public static void main(String[] args) {
        File inputFile = new File("files/numbers.txt");
        File outputFile = new File("files/output.txt");


        //This closes the file reader automatically without including the finally part.
        try (
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile);
                ) {
            while (fileReader.hasNext()) {
                fileWriter.println(fileReader.nextDouble());
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("Error: " + e.getMessage() + " " );
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unkown error occured: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
