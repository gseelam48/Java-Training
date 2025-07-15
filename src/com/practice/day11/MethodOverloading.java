package com.practice.day11;

import java.util.Scanner;

public class MethodOverloading {
    int a;
    int b;

    public int getA() {
        return a;
    }

    public int setA(int a) {
        this.a = a;
        return a;
    }

    public int getB() {
        return b;
    }

    public int setB(int b) {
        this.b = b;
        return b;
    }

    MethodOverloading() {

    }

    MethodOverloading(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        MethodOverloading methodOverloading = new MethodOverloading();
        MethodOverloading methodOverloading1 = new MethodOverloading(a, b);
        int y = methodOverloading.getB();
        System.out.println(y);
        int x = methodOverloading.getA();
        System.out.println(x);
        int add = methodOverloading.add(a, b);
        System.out.println(add);
        int add1 = methodOverloading.add(a, b, c);
        System.out.println(add1);
        int z = methodOverloading1.setA(a);
        System.out.println(z);
        int w = methodOverloading1.setB(b);
        System.out.println(w);

    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}


