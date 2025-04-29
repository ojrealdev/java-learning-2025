package main.java.objects;

import java.util.Scanner;

public class HomeAreaCalculator {
    private Scanner sc = new Scanner(System.in);


    public Rectangle getRoom() {
        System.out.println("Enter Length:");
        int length  = sc.nextInt();
        System.out.println("Enter Width:");
        int width = sc.nextInt();

        return new Rectangle(length, width);
    }
}
