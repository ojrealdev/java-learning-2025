package main.java.exeptions;

public class ThrowingExeptions {

    public static void main(String[] args) {
        try {
            calculatePay(30.50, 3000.00);
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void calculatePay(double hours, double payRate)
            throws NegativeInputExeption {
                if(hours > 40 ) {
                    throw new IllegalArgumentException("Hours must be less than or equal to 40.");
                } else if(hours < 0 ) {
                    throw new NegativeInputExeption();
                }
    }
}
