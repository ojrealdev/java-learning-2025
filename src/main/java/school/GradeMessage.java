package main.java.school;

public class GradeMessage {
    int totalMarks;

    public static void main(String[] args) {
        getGrade(90);
    }

    static void getGrade(int marks) {
        switch (marks) {
            case 30 -> message("You Got a C!");
            case 40 -> message("You Got a B!");
            case 70, 60 -> {
                System.out.println("Exellent! ");
                message("You Got an A!");
            }
            case 80 -> message("You Got an A++");
            case 90, 100 -> {
                System.out.println("Magnificent! ");
                message("You Got an A+++");
            }
            default -> message("Please enter a valid grade!");
        }
    }

    static void message(String msg) {
        System.out.println(msg);
    }
}
