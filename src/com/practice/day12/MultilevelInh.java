package com.practice.day12;

public class MultilevelInh {

    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.display();
        labrador.bark();
        labrador.eat();
        Dog4 dog4 = new Dog4();
        dog4.eat();
        dog4.bark();
    }
}

class Animal4 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog4 extends Animal4 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog4 {
    void display() {
        System.out.println("Labrador is a type of Dog");
    }
}








