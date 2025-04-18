package main.java.objects;

public class Rectangle {
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

     protected int calculateArea() {
        int area = length * width;
        return area;
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
