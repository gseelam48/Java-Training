package day6;

public class PositiveOrNegative {
    public static void main(String[] args) {
        System.out.println(getPosOrNeg(-1));
    }

    public static String getPosOrNeg(int num) {
        if (num >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }
}
