package com.practice.day18;

public class  AssSHasAdress {
    public static void main(String[] args) {
        Address address = new Address("Mckenny",75070);
        Student student = new Student(address);
        student.Student();
        student.PrintStudentInf();

    }
}
class Address{
    String city;
    int pin;
    Address(){

    }
    Address(String city,int pin){
        this.city=city;
        this.pin=pin;
    }
}
class Student{
Address address;
public Student(Address address){
    this.address=address;
}

   public void Student(){
       System.out.println("Student name : Gopi");
    }
    public void PrintStudentInf(){
        System.out.println("Address : " + address.city+address.pin);
    }
}
