package com.practice.day9;

import java.util.Scanner;

public class IntegerScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(mult(a, b));

    }

    public static int mult(int a, int b) {
        return a * b;
    }
}
