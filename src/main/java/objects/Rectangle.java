package main.java.objects;

import java.util.Scanner;

public class Rectangle {
    private Scanner scanner = new Scanner(System.in);
    private int length;
    private int width;

    public Rectangle() {
        setLength(10);
        width = 100;
    }

//    all args constructor
    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    protected int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }

    protected int calculateArea() {
        return calculateArea(30, 20);
    }

    protected int calculatePerimeter(int length, int width) {
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    protected void setLength(int defaultLength) {
        length = defaultLength;
    }
    protected void setWidth(int defaultWidth) {
        width = defaultWidth;
    }
    protected int getLength()  {
        return length;
    }
    protected int getWidth()  {
        return width;
    }
}
