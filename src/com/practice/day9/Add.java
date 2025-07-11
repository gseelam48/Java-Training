package com.practice.day9;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        System.out.println(add(a, b, c));


    }

    public static float add(float a, float b, float c) {
        return a + b + c;
    }
}
