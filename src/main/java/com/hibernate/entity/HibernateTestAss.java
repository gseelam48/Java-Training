package com.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class HibernateTestAss {
    public static void main(String[] args) {
        // Create SessionFactory from hibernate.cfg.xml
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        // Open a session
        Session session = factory.openSession();
        // Begin transaction
        session.beginTransaction();
        // Create an employee object
        // course
        //student
        List<Student> studentList = new ArrayList<>();
        Student stud1 = new Student( "gopi", 200);
        Student stud2 = new Student( "sai", 500);
        studentList.add(stud1);
        studentList.add(stud2);
        Course course = new Course();
        course.setCourseName("phy");
        course.setStudentList(studentList);
        // Student student1 = session.get(Student.class,1L);

        session.save(course);
        // session.delete(student1);
        // Commit transaction
        session.getTransaction().commit();
        // Retrieve student
        //Student savedEmp = session.get(Student.class, student1.getId());
        // System.out.println("Saved Student: " +student1);
        // Close session
        session.close();
        factory.close();
    }

}

