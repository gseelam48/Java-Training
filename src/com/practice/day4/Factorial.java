package com.practice.day4;

public class Factorial {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(Factorial.calculateFactorial(number));
    }

    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = number; i <=5; i++) {
            factorial = factorial * i;
            System.out.println("factorial" + factorial);
        }
        return factorial;
    }
}
