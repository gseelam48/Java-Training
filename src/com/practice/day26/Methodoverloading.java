package com.practice.day26;

public class Methodoverloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        Methodoverloading methodoverloading = new Methodoverloading();
        System.out.println("addtion of two numbers " + methodoverloading.add(a, b));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
