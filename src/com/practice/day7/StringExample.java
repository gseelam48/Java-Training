package com.practice.day7;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name = "Gopi";

        int length = name.length();
        String toUpperCase = name.toUpperCase();
        String toLowerCase = name.toLowerCase();
        String[] split = name.split("GOPI");
        String compareTo = String.valueOf(name.compareTo("Venu"));
        String compareToIgnoreCase = String.valueOf(name.compareToIgnoreCase("CHINTZ"));
        String replaceAll = name.replaceAll("G", "GG");
        String substring = name.substring(4);
        String equals = String.valueOf(true);
        String equalsIgnoreCase = String.valueOf(false);
        String indexOf = String.valueOf(name.indexOf("Gold"));
        String trim = name.trim();
        String charAt = String.valueOf(name.charAt(2));
        String concat = name.concat("o");
        String matches = String.valueOf(name.matches("Chain"));
        String startsWith = String.valueOf(false);
        String endsWith = String.valueOf(true);
        String intern = name.intern();
        String getBytes = Arrays.toString(name.getBytes(String.valueOf(10)));
        String contentEquals = String.valueOf(name.contentEquals(""));
        String hashCode = String.valueOf(name.hashCode());
        String join = String.join("Water");
        String replaceFirst = name.replaceFirst(".", ".");
        String subSequence = (String) name.subSequence(1, 2);
        String charArray = Arrays.toString(name.toCharArray());
        String formatted = name.formatted();

        System.out.println("length of given " + name + " is : " + length);
        System.out.println("Upper case of given" + name + " is :" + toUpperCase);
        System.out.println("Upper case of given" + name + " is :" + toLowerCase);
        System.out.println("Upper case of given" + name + " is :" + Arrays.toString(split));
        System.out.println("Upper case of given" + name + " is :" + compareTo);
        System.out.println("Upper case of given" + name + " is :" + compareToIgnoreCase);
        System.out.println("Upper case of given" + name + " is :" + replaceAll);
        System.out.println("Upper case of given" + name + " is :" + substring);
        System.out.println("Upper case of given" + name + " is :" + equals);
        System.out.println("Upper case of given" + name + " is :" + equalsIgnoreCase);
        System.out.println("Upper case of given" + name + " is :" + indexOf);
        System.out.println("Upper case of given" + name + " is :" + trim);
        System.out.println("Upper case of given" + name + " is :" + charAt);
        System.out.println("Upper case of given" + name + " is :" + concat);
        System.out.println("Upper case of given" + name + " is :" + matches);
        System.out.println("Upper case of given" + name + " is :" + startsWith);
        System.out.println("Upper case of given" + name + " is :" + endsWith);
        System.out.println("Upper case of given" + name + " is :" + intern);
        System.out.println("Upper case of given" + name + " is :" + getBytes);
        System.out.println("Upper case of given" + name + " is :" + contentEquals);
        System.out.println("Upper case of given" + name + " is :" + hashCode);
        System.out.println("Upper case of given" + name + " is :" + join);
        System.out.println("Upper case of given" + name + " is :" + replaceFirst);
        System.out.println("Upper case of given" + name + " is :" + subSequence);
        System.out.println("Upper case of given" + name + " is :" + charArray);
        System.out.println("Upper case of given" + name + " is :" + formatted);
    }
}