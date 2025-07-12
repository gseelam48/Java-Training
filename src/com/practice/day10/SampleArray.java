package com.practice.day10;

import java.util.Scanner;

public class SampleArray {
    public static void main(String[] args) {
        // created scanner class object
        Scanner scanner = new Scanner(System.in);
        // read the Array size
        int size = scanner.nextInt();
        //  declare the array
        int[] s = new int[size];
        // read the array elements
        for (int i = 0; i < size; i++) {
            s[i] = scanner.nextInt();

        }
        // printing the array elements
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        int num1 = scanner.nextInt();

        SampleArray simpleArray = new SampleArray();
        System.out.println(simpleArray.check(s, num1));

    }

    public boolean check(int[] cash, int num1) {
        for (int i = 0; i < cash.length; i++) {
            if (cash[i] == num1) {
                return true;
            }

        }
        return false;
    }

}
