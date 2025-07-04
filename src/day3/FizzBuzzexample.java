package day3;

public class FizzBuzzexample {
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i > 10) {
                    System.out.println("Fizz Buzz");
                } else if (i % 2 == 0) {
                    System.out.println(i + " - Fizz");
                } else {
                    System.out.println(i + " - Buzz");
                }
            }
            int outOfRange = 11;
            if (outOfRange > 10) {
                System.out.println(outOfRange + " - Fizz Buzz");
            }
        }
    }


