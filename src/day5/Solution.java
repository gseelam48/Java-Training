package day5;

public class Solution {
    public static void main(String[] args) {
        int num = 25;
        String studentResult = studentResult(num);
        System.out.println("result:" + studentResult);

    }

    public static String studentResult(int num) {
        if (num >= 50) {
            return " pass ";
        } else {
            return "Fail";
        }

    }
}

