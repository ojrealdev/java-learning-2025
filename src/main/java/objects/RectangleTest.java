package main.java.objects;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle roomOne = new Rectangle();
        Rectangle roomTwo = new Rectangle(10, 40);

        int roomOneArea = roomOne.calculateArea();
        int roomTwoArea = roomTwo.calculateArea();

        System.out.println("RoomOne Area: " + roomOneArea);
        System.out.println("RoomTwo Area: " + roomTwoArea);

    }
}
