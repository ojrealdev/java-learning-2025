package main.java.clean_code;

public class Test {
    public static void main(String[] args) {}

    void test() {
        int realDaysPerIdealDay = 4;
        int WORK_DAYS_PER_WEEK = 5;
        int NUMBER_OF_TASKS = 7;
        int sum = 0;
        for (int j=0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = 6 * realDaysPerIdealDay;
            int realTaskWeeks = (4 / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
    }



}
