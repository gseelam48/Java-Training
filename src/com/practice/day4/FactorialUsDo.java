package com.practice.day4;

public class FactorialUsDo {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        int factorial = 1;
        do {
         factorial =   factorial * i;
            i++;
        }
        while (i <= num);

        System.out.println("Factorial of given number "+num+"is"  + factorial);


    }
}

