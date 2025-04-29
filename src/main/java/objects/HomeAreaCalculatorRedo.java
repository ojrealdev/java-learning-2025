package main.java.objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner sc = new Scanner(System.in);

    public Rectangle getRoom() {
        System.out.println("Enter Length:");
        int length  = sc.nextInt();
        System.out.println("Enter Width:");
        int width = sc.nextInt();

        return new Rectangle(length, width);
    }

    public static void main(String[] args) {
        //You instantiate the class so that you can use a non-static method inside main which is static by nature.
        HomeAreaCalculatorRedo hac = new HomeAreaCalculatorRedo();
        Rectangle roomOne = hac.getRoom();
        Rectangle roomTwo = hac.getRoom();
        hac.calculateAreaOfRooms(roomOne, roomTwo);
    }

    public int calculateAreaOfRooms(Rectangle roomOne, Rectangle roomTwo) {
        return roomOne.calculateArea() + roomTwo.calculateArea();
    }
}
