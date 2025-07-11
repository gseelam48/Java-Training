package com.practice.day9;

import java.util.Scanner;

public class DoubleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        System.out.println(sub(n1, n2, n3));
    }

    public static double sub(double n1, double n2, double n3) {
        return (n1 - n2 - n3);
    }
}
