package com.practice.day10;

import java.util.Scanner;

public class SampleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] name = new String[size];
        for (int i = 0; i < size; i++) {
            name[i] = scanner.next();
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        String name1 = scanner.next();
        SampleString sampleString = new SampleString();
        System.out.println(sampleString.check(name, name1));
    }

    public String check(String[] name, String name1) {
        for (int i = 0; i < name.length; i++) {
            if (name[i] == name1) {
                return "equal";
            }
        }

        return "not equal";
    }
}
