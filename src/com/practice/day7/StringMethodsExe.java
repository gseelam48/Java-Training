package com.practice.day7;

import java.util.Locale;

public class StringMethodsExe {
    public static void main(String[] args) {
        String liquid = "Water";
        String presence = "  WHITE printer  ";
        int length = liquid.length();
        char charAt = presence.charAt(8);
        String substring = presence.substring(4, 8);
        boolean equals = presence.equals("  white prinTer  ");
        boolean equalsIgnoreCase = presence.equalsIgnoreCase("  whIte printEr  ");
        String lowerCase = presence.toLowerCase();
        String uppercase = presence.toUpperCase();
        String trim = presence.trim();
        boolean contains = presence.contains("W");
        String replace = presence.replace("WHITE", "white");

        System.out.println(" The length of given " + liquid + " is " + length);
        System.out.println(" The  given " + presence + " is " + charAt);
        System.out.println(" The  given " + presence + " is " + substring);
        System.out.println(" The  given " + presence + " is " + equals);
        System.out.println(" The  given " + presence + " is " + equalsIgnoreCase);
        System.out.println(" The  given " + presence + " is " + lowerCase);
        System.out.println(" The  given " + presence + " is " + uppercase);
        System.out.println(" The  given " + presence + " is " + trim);
        System.out.println(" The  given " + presence + " is " + contains);
        System.out.println(" The  given " + presence + " is " + replace);

    }
}
