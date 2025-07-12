package com.practice.day10;

import java.util.Scanner;

public class ByteSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        byte[] arr = new byte[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextByte();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
