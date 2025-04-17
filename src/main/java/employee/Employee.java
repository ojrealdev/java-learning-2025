package main.java.employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Enter your first name:");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        System.out.println("Enter your last name:");
        String lastName = scanner.next();
        System.out.println("Enter you age: ");
        int age = scanner.nextInt();

        scanner.close();
    }

}
