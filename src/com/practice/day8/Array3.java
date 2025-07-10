package com.practice.day8;

public class Array3 {
    public static void main(String[] args) {
        String name = " rose flower ";
        String[] split = name.split(" ");
        System.out.println(split.length);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
