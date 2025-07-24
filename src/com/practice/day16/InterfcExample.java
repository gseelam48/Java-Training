package com.practice.day16;

public class InterfcExample {
    public static void main(String[] args) {
        C c = new C();
        c.showb();
    }
}

interface A {
    default void show() {
        System.out.println("hi");
    }
}

interface B {
    default void showb() {
        System.out.println("hello");
    }
}

class C implements A, B {

    @Override
    public void show() {
        B.super.showb();
    }

    public void showc() {
        System.out.println("subclass c");
    }
}

