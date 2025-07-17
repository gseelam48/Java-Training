package com.practice.day12;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleep();
       // Animal animal = new Animal("puppy", 12);
        //  animal.eat();

        /*
         Default values
           String null;
           int 0;
           boolean false;
           char block;
           short 0;
           byte 0;
           float 0.0;
           double 0.0;
           long 0;

           */

        Dog dog = new Dog("tommy",11);
        dog.sleep();
    }
}

class Animal {
    String name;
    int age;
    char s;
    short x;
    byte y;
    float z;
    double d;
    long l;
    boolean b;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + "is sleeping"+"with"+s +"with"+x+"w"+y+"w"+z+"w"+d+"w"+l+"w"+b);
    }

    public void eat() {
        System.out.println(name + "is eating");
    }

}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void sleep() {
        System.out.println(name + "is sleeping");
    }

    public void eat() {
        System.out.println(name + "is eating");
    }

    public void bark() {
        System.out.println(name + "is barking");
    }
}

