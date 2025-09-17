/*package com.practice.day15;

import java.util.Scanner;

// static is a keyword

// it is not a access modifier
// we can declare static variable, method, classes
// static block also
public static class StatKeyExa {
}

        static class B {

        }

        static int x = 12;

        static {
            System.out.println("static block 1");
        }

        static {
            System.out.println("static block 2");
        }

        static {
            System.out.println("static block 3");
        }

        // static variables we can create in class level only
        public static void main(String[] args) {
            int a = 10, b = 20;
            int x = 30;
            StatKeyExa statKeyExa = null;
            System.out.println("static" + statKeyExa.x);
            // for local variables we cant add static
            // without static
            //create object
            statKeyExa = new StatKeyExa();
            System.out.println("add of two numbers without static : " +statKeyExa.add);
            // with static we can call methods directly with the name, no need to create object
            System.out.println("add of two numbers with static : " + statKeyExa.add1(1, b));
        }

        // creating method for add of two numbers
        int add(int a, int b) {
            return a + b;
        }

        static int add1(int a, int b) {
            return a + b;
        }*/