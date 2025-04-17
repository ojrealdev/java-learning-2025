package main.java.basics;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
       calculateGrossPay();
    }

    static void calculateGrossPay() {
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double hourlyPayRate = scanner.nextDouble();
        scanner.close();

        double grossPay = hourlyPayRate * hours;
        System.out.println("Gross Pay is: " + grossPay);
    }
}
