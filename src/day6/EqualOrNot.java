package day6;

public class EqualOrNot {
    public static void main(String[] args) {
        System.out.println(equalOrNot(20, 30));
    }

    public static String equalOrNot(int num, int num1) {
        if (num == num1) {
            return "it is equal";
        } else {
            return "not equal";
        }
    }
}
