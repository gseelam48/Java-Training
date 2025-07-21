package com.practice.day15;


public class OverrAss1 {
    public static void main(String[] args) {
        Vehicle car = new Car(200);
        car.displayinf();
        ((Car)car).cartype();
        ((Car) car).fueltype();
        Vehicle bike = new Bike(150);
        bike.displayinf();
        ((Bike) bike).biketype();
        ((Bike) bike).fueltype();
    }
}

class Vehicle {
    int speed;

    public Vehicle() {
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void displayinf() {
        System.out.println("This is a vehicle with speed : " + speed);
    }
}

class Car extends Vehicle {
    public Car(int speed) {
        super(speed);
    }

    public void displayinf() {
        System.out.println("This is a Car. Speed is : " + speed);
    }

    public void cartype() {
        System.out.println("This is a Range rover sport " + speed);
    }

    public void fueltype() {
        System.out.println("Car uses Petrol or Diesel");
    }
}

class Bike extends Vehicle {
    public Bike(int speed) {
        super(speed);
    }

    public void displayinf() {
        System.out.println("This is a Bike.Speed is : " + speed);
    }

    public void biketype() {
        System.out.println("This is a pulser 150 " + speed);
    }

    public void fueltype() {
        System.out.println("Bike uses Petrol ");
    }
}
