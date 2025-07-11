package com.practice.day9;

import java.util.Scanner;

public class ReadStringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        System.out.println(result(name1, name2));

    }

    public static boolean result(String name1, String name2) {
        return name1.equals(name2) ;

    }
}
