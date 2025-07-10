package com.practice.day8;

public class Array4 {
    public static void main(String[] args) {
        String name = " water fall ";
        String[] split = name.split(" ");
        System.out.println(split.length);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        byte[] b = new byte[3];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        System.out.println(b[0] + ":" + b[1] + ":" + b[2]);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] * 2);
        }
    }
}
