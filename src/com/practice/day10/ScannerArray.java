package com.practice.day10;

import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of boolean: ");
        int size = scanner.nextInt();
        boolean[] arr = new boolean[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextBoolean();

        }
        System.out.println("boolean values are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
