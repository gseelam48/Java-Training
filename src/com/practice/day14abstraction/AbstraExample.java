package com.practice.day14abstraction;

public class AbstraExample {
    public static void main(String[] args) {
        // we can't create object for abstract class directly
        // Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makesound();
        dog.eat();
        cat.makesound();
        cat.eat();


    }
}
// it contains concrete methods and abstract methods
// concrete method means which is having implementation
// abstract method means which is not having implementation
abstract class Animal {
    public void eat() {
        System.out.println("animal is eating");
    }

    abstract public void makesound();

}

class Dog extends Animal {
    @Override
    public void makesound() {
        System.out.println("dog sounds woof woof");

    }
}

class Cat extends Animal {
    @Override
    public void makesound() {
        System.out.println("cat sounds meow meow");
    }
}

