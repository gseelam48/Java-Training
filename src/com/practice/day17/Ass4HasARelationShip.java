package com.practice.day17;

public class Ass4HasARelationShip {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.drive();
    }
}

class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

class Car1 {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("car is driving");
    }
}