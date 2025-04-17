package main.java.objects;

import java.util.Scanner;

public class Rectangle {
    private static Scanner scanner = new Scanner(System.in);
    private static int length;
    private static int width;

    public Rectangle() {
            setLength(10);
    }


    public static void main(String[] args) {
        System.out.println("Enter length: ");
        length = scanner.nextInt();
        System.out.println("Enter width: ");
        width = scanner.nextInt();

        System.out.println("The area is: " + calculateArea(length, width));
        System.out.println("The perimeeter is: " + calculatePerimeter(length, width));
        scanner.close();
    }

    private static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }

    public static int calculatePerimeter(int length, int width) {
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    protected static void setLength(int defaultLength) {
        length = defaultLength;
    }
}
