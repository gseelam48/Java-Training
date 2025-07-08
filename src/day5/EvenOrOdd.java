package day5;

public class EvenOrOdd {
    public static void main(String[] args) {

        System.out.println(evenOrOdd(9));
    }

    public static String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return " even ";
        } else {
            return " odd ";
        }
    }
}
