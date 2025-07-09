package com.practice.day7;

public class StringMethodsExe {
    public static void main(String[] args) {
        String liquid = "Water";
        String Appearance = "  WHITE printer  ";
        int length = liquid.length();
        char charAt = Appearance.charAt(8);
        String substring = Appearance.substring(4, 8);
        boolean equals = Appearance.equals("  white prinTer  ");
        boolean equalsIgnoreCase = Appearance.equalsIgnoreCase("  whIte printEr  ");
        String lowerCase = Appearance.toLowerCase();
        String uppercase = Appearance.toUpperCase();
        String trim = Appearance.trim();
        boolean contains = Appearance.contains("W");
        String replace = Appearance.replace("WHITE", "white");

        System.out.println(" The length of given " + liquid + " is " + length);
        System.out.println(" The  given " + Appearance + " is " + charAt);
        System.out.println(" The  given " + Appearance + " is " + substring);
        System.out.println(" The  given " + Appearance + " is " + equals);
        System.out.println(" The  given " + Appearance + " is " + equalsIgnoreCase);
        System.out.println(" The  given " + Appearance + " is " + lowerCase);
        System.out.println(" The  given " + Appearance + " is " + uppercase);
        System.out.println(" The  given " + Appearance + " is " + trim);
        System.out.println(" The  given " + Appearance + " is " + contains);
        System.out.println(" The  given " + Appearance + " is " + replace);

    }
}
