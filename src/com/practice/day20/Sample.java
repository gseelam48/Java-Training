package com.practice.day20;

public class Sample {
    public static void main(String[] args) {

        String name = new String("test");
        String name2 = new String("test");

        System.out.println(name == name2);// it will compare references
        System.out.println(name.equals(name2)); // it will compare content

    }
}