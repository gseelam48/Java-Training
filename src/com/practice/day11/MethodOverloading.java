package com.practice.day11;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        MethodOverloading methodOverloading = new MethodOverloading();

        int add = methodOverloading.add(a, b);
        System.out.println(add);
        int add1 = methodOverloading.add(a, b, c);
        System.out.println(add1);

    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}


