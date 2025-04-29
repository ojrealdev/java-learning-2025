package main.java.objects;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        length = 20;
        width = 100;
    }

//    all args constructor
    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

     public int calculateArea() {
        int area = length * width;
        return area;
    }

    public void setLength(int defaultLength) {
        length = defaultLength;
    }
    public void setWidth(int defaultWidth) {
        width = defaultWidth;
    }
    public int getLength()  {
        return length;
    }
    public int getWidth()  {
        return width;
    }
}
