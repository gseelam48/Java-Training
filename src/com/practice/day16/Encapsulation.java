package com.practice.day16;

public class Encapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("gopi");
        employee.setId(123456l);
        employee.setSalary(200000.00);
        System.out.println("Name : " + employee.getName());
        System.out.println("Id : " + employee.getId());
        System.out.println("Salary : " + employee.getSalary());

    }
}

class Employee {
    private String name;
    private long id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//        int calculateSalary(){
//            return 2000;
//        }
}

