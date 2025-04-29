package main.java.array;

import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    public static final int MAX_TICKETS = 69;

    public static void main(String[] args) {
        generateNumbers();
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNum = random.nextInt(1, MAX_TICKETS);

            ticket[i] = randomNum;
        }
        return ticket;
    }
}
