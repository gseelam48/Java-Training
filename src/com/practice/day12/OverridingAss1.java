package com.practice.day12;

public class OverridingAss1 {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1("lab",13);
        dog1.makeSound();
        Cat cat = new Cat("pussy",10);
        cat.makeSound();


    }
}
class Animal1 {
    int age;
    String  name;


    public Animal1() {

    }

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + "is sleeping");
    }

    public void eat() {
        System.out.println(name + "is eating");
    }

}

class Dog1 extends Animal1 {
    public Dog1(String name, int age) {

        super(name, age);
    }
    public void makeSound(){
        System.out.println(name+"is barking");

    }
}
class Cat extends Animal1{
    public Cat(String name, int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println(name+"is meowing");
    }
}
