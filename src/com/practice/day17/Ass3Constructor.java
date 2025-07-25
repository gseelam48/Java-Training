package com.practice.day17;

public class Ass3Constructor {
    public static void main(String[] args) {
        Student student = new Student("gopi", 25);
        student.studenName();
        student.studentAge();
        student.StudentId();
    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void person() {
        System.out.println(" Person details");
    }
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    void studentAge() {
        System.out.println("Age : " + age);
    }

    void studenName() {
        System.out.println("Name : " + name);
    }

    void StudentId() {
        System.out.println("Roll number : 23456");
    }
}