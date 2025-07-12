package com.practice.day10;

import java.util.Scanner;

public class FloatSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextFloat();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
