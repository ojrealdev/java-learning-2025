package main.java.objects;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle roomOne = new Rectangle();
        Rectangle roomTwo = new Rectangle();
//        When not using static
        int roomOneArea = roomOne.calculateArea(roomOne.getLength(), roomOne.getWidth());
        int roomTwoArea = roomTwo.calculateArea(roomTwo.getLength(), roomTwo.getWidth());

        System.out.println("RoomOne Area: " + roomOneArea);
        System.out.println("RoomTwo Area: " + roomTwoArea);

    }
}
