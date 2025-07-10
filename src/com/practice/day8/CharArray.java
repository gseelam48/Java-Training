package com.practice.day8;

public class CharArray {
    public static void main(String[] args) {
        char[] c = new char[3];
        c[0] = 'a';
        c[1] = 'x';
        c[2] = 'e';

        System.out.println(c[0] + ":" + c[1] + ":" + c[2]);

        for (int i = 0; i < c.length; i++) {
            if ("aeiou".indexOf(c[i]) != -1) {
                System.out.println(c[i] + " is a vowel.");
            }
        }
    }
}
