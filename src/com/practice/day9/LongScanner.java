package com.practice.day9;

import java.util.Scanner;

public class LongScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n1 = scanner.nextLong();
        long n2 = scanner.nextLong();
        System.out.println(mult(n1, n2));

    }

    public static long mult(long n1, long n2) {
        return n1 * n2;
    }

}
