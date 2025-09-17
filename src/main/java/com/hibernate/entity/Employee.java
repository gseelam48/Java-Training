package com.hibernate.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name")
    private String name;


    @Column(name = "salary")
    private double salary;
public Employee(){

}
    public Employee(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;


    public Department getDepartment() {
        return department;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


  /*  public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }*/


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
