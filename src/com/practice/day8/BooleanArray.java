package com.practice.day8;

public class BooleanArray {
    public static void main(String[] args) {
        boolean[] flags = new boolean[3];
        flags[0] = true;
        flags[1] = false;
        flags[2] = true;

        System.out.println(flags[0] + ":" + flags[1] + ":" + flags[2]);

        int trueCount = 0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i]) trueCount++;
            System.out.println("Number of true values: " + trueCount);
        }
    }
}
