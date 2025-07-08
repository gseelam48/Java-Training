package day5;

public class PrimeNum {
    public static void main(String[] args) {
        int num = 15;
        String primeNumber = primeNumber(num);
        System.out.println(primeNumber);

    }

    public static String primeNumber(int num) {
        if (num <= 1) {
            return "it is not a prime";
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return "it is not prime";

            }
        }
        return "it is prime";
    }
}

