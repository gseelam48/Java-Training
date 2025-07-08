package day6;

public class VotingEligibility {
    public static void main(String[] args) {
        System.out.println(votingEligibility(17));
    }

    public static String votingEligibility(int age) {
        if (age >= 18) {
            return " Eligible ";
        } else {
            return "Not Eligible";
        }
    }
}
