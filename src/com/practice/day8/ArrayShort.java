package com.practice.day8;

public class ArrayShort {
    public static void main(String[] args) {
        short[] s = new short[2];
        s[0] = 5;
        s[1] = 2;
        System.out.println(s[0]+":"+s[1]);
        short min = s[0];
        for (int i=0;i<s.length;i++){
            if (s[i]< min)
                min=s[i];
            System.out.println("min value" + min);
        }
    }
}
