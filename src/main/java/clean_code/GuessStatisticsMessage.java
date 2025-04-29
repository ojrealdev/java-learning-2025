package main.java.clean_code;


public class GuessStatisticsMessage {


    public static void main(String[] args) {
        GuessStatisticsMessage guessStatisticsMessage = new GuessStatisticsMessage();
        String msg = guessStatisticsMessage.makeMessage(5, 'A');
        System.out.println(msg);
    }


    String makeMessage(int count, char candidate) {
        String number;
        String verb;
        String pluralModifier;

        if(count == 0) {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        } else if(count == 1) {
            number = "1";
            verb = "is";
            pluralModifier = "";
        } else {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }

        String message = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
        return message;
    }
}