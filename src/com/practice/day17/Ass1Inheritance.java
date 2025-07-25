package com.practice.day17;

public class Ass1Inheritance {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

    }
}

class Animal {
    void makeSound() {
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

