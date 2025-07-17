package com.practice.day13;

public class InherPract1 {
    public static void main(String[] args) {
        Cat2 cat2 = new Cat2();
        cat2.eat();
        cat2.makesound();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}

class Animal {
    void eat() {
        System.out.println("is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("is barking");
    }
}

class Cat2 extends Dog {
    void makesound() {
        System.out.println("is meiowing");
    }
}
