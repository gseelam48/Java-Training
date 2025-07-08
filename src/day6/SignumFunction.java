package day6;

public class SignumFunction {
    public static void main(String[] args) {
        System.out.println(n(2));
    }

    public static int n(int m) {
        if (m > 0) {
            return 1;
        } else if (m < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
