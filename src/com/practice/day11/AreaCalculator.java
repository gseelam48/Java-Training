package com.practice.day11;

import java.util.Scanner;
// created a class named AreaCalculator
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        double radius = scanner.nextDouble();
        AreaCalculator areaCalculator = new AreaCalculator();
        int areaSquare = areaCalculator.calculateArea(side);
        System.out.println(areaSquare);
        int areaRectangle = areaCalculator.calculateArea(length, breadth);
        System.out.println(areaRectangle);
        double areaCircle = areaCalculator.calculateArea(radius);
        System.out.println(areaCircle);

    }
//
    int calculateArea(int side) {
        return side * side;
    }

    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

}
