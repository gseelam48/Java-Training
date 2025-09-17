package com.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


public class HibernateTest {
    public static void main(String[] args) {
        // Create SessionFactory from hibernate.cfg.xml
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        // Open a session
        Session session = factory.openSession();
        // Begin transaction
        session.beginTransaction();
        // Create an employee object

        Department department = new Department();
        department.setDepartmentname("IT");                                  // course
                                                                             //student
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Sathish", 50000);
        emp1.setDepartment(department);
        Employee emp2 = new Employee("kumar", 50000);
        emp2.setDepartment(department);
        employeeList.add(emp1);
        employeeList.add(emp2);
        department.setEmployeeList(employeeList);
Department department1 = session.get(Department.class,1L);
       session.save(department);
        session.delete(department1);
        // Commit transaction
        session.getTransaction().commit();
        // Retrieve employee
        // Employee savedEmp = session.get(Employee.class, emp.getId());
        //System.out.println("Saved Employee: " + savedEmp);
        // Close session
        session.close();
        factory.close();
    }

}

