package com.practice.day17;

public class Ass2Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.playMusic();
    }
}

class Vehicle {
    void startEngine() {
        System.out.println("Engine Started");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println("Music Playing");
    }

    void startEngine() {
        System.out.println("Engine Started");
    }
}