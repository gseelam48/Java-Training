package com.practice.day10;

import java.util.Scanner;

public class ScannerSmple {
    public static void main(String[] args) {
        // crated a scanner class object
        Scanner scanner = new Scanner(System.in);
        //read the values
        String name1 = scanner.next();
        String name2 = scanner.next();
        // call from method
        ScannerSmple s = new ScannerSmple();
        System.out.println(s.result(name1, name2));
    }
//created a method with return type boolean String as the argument
    public  boolean result(String name1, String name2) {
        return name1.equals(name2);
    }
}
