package com.practice.day9;

import java.util.Scanner;

public class IntScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(add(x, y));
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
