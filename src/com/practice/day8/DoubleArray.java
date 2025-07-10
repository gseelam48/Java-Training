package com.practice.day8;

public class DoubleArray {
    public static void main(String[] args) {
        double[] price = new double[3];//reverse
        price[0] = 9.99;
        price[1] = 4.50;
        price[2] = 7.25;

        System.out.println(price[0] + ":" + price[1] + ":" + price[2]);

        for (int i = price.length - 1; i >= 0; i--) {
            System.out.println("Reverse: " + price[i]);
        }
    }
}
