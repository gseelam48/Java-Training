package com.practice.day27;

public class MethodHiding {
    public static void main(String[] args) {
         Parent parent = new Child();
         parent.display();
         Child child =new Child();
         child.display();
    }
}
class Parent{
    public static void display(){
        System.out.println("parent static method");
    }
}
class Child extends Parent{
    public static void display(){
        System.out.println("child static method");
    }
}