package com.practice.day8;

public class ArrayExample {
    public static void main(String[] args) {
        // array declaration
        int[] a = new int[3];
        //array initialization
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0] + ":" + a[1] + ":" + a[2]);
        // printing an array
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
