package day6;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(getLeapYear(2016));
    }

    public static String getLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return year + " is a leap year";
        } else {
            return year + " not a leap year";
        }
    }
}
