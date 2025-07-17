package com.practice.day12;

public class BasicInheritance {
    public static void main(String[] args) {
        Person person = new Person(25,"gopi");
        person.sleep();
        person.eat();
        Student student = new Student(12,"g");
        student.sleep();
        student.eat();
        student.college();
        student.study();

    }
}
class Person{
    int age;
    String name;
    public Person(){

    }
    public Person (int age,String name){
        this.age = age;
        this.name = name;
    }
    public void eat(){
        System.out.println("he is eating");
    }
    public void sleep(){
        System.out.println("he is sleeping");
    }
}
class Student extends Person{
    public Student(int age, String name){
        super(age, name);
    }
    public void college(){
        System.out.println("he is going to college");
    }
    public void study(){
        System.out.println("he will study");
    }

}
