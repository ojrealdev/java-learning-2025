package main.java.employee;

import java.util.Scanner;

public class SalaryCalculator {
    static double basic;
    static double allowances;
    static int deductions;
    static double taxRate;

    public static void main(String[] args) {
        calculateSalary();
    }

    public static void calculateSalary() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's you basic salary?");
        basic = scanner.nextDouble();
        System.out.println("How much allowances do you get?");
        allowances = scanner.nextDouble();

        System.out.println("How much are you deducted?");
        deductions = scanner.nextInt();

        System.out.println("What's the percentage tax rate?");
        taxRate = scanner.nextInt() / 100;

        double gross = basic + allowances;
        double tax = gross * taxRate;
        double netSalary = gross - deductions - tax;

        System.out.println("Net Salary is: " + netSalary);
        if(netSalary > 1000000) {
            System.out.println("You are a millionaire!");
        } else if (netSalary > 100000 && netSalary < 1000000) {
            System.out.println("Youre a hundred thousandionaire!");
        } else if(netSalary > 10000000) {
            System.out.println("You're a 10 millionaire!");
        }
        else System.out.println("You're doing fine, keep it up!");


        scanner.close();
    }
}
