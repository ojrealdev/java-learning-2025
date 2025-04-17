package main.java.methods;

import java.util.Scanner;

public class GreetUser {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
        scanner.close();
    }

    public static String getUserName() {
        System.out.println("Enter your name:");
        String name = scanner.next();
        return name;
    }

    public static void greetUser(String name) {
        System.out.println("Hi there, " + name);
        System.out.println("Please enter your last name:");
        String lastname = scanner.next();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        greetUser(lastname, age);
    }

    public static void greetUser(String lastname, int age) {
        System.out.println("Your last name is, " + lastname);
        System.out.println("Your age is: " + age);
    }
}
