package main.java.exeptions;

public class NegativeInputExeption extends Exception {

    public NegativeInputExeption() {
        this("Input must be greater than or equal to zero");
    }

    public NegativeInputExeption(String message) {
        super(message);
    }
}
