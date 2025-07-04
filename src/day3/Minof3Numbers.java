package day3;

public class Minof3Numbers {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 10;
        String result = minofThree(a, b, c);
        System.out.println(result);
    }

    public static String minofThree(int a, int b, int c) {
        if (a < b && a < c) {
            return "a is small";
        } else if (b < a && b < c) {
            return"b is small";
        } else if (c < a && c < b) {
            return"c is small";
        } else if (a == b && b == c && c == a) {
            return"all are equal";
        } else if (a == b || b == c || c == a) {
            return"there is more than one smaller number";
        }
        return null;
    }

}
