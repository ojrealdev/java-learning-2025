package main.java.abstraction;

public class Rectangle extends Shape {
    public static void main(String[] args) {
            new Rectangle(10, 40);
//        System.out.println("Rectangle: " + rectangle.);
    }

    Rectangle(double length, double width) {
        calculateArea(length, width);
        calculatePerimeter(length, width);
    }

    @Override
    double calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area is: " + area);
        return  area;
    }

    @Override
    double calculatePerimeter(double length, double width) {
        double perimeter = 2 *(length + width);
        System.out.println("Perimeter is: " + perimeter);
        return  perimeter;
    }
}
