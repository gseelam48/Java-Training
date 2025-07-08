package day6;

public class MonthlyEarnings {
    public static void main(String[] args) {
        System.out.println("Total Earnings: " + totalEarnings(24,8));

    }

    public static int totalEarnings(int hours, int pay) {
        return hours * pay;
    }
}
