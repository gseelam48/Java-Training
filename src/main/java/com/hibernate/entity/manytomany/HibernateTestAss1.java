package com.hibernate.entity.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestAss1 {
    public static void main(String[] args) {
        // Create SessionFactory from hibernate.cfg.xml
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        // Open a session
        Session session = factory.openSession();
        // Begin transaction
        session.beginTransaction();
        ProjectEmployee employee1 = new ProjectEmployee("gopi");
        ProjectEmployee employee2 = new ProjectEmployee("rutesh");
        Project project1 = new Project("polavaram");
        Project project2 = new Project("pulichintala");
        employee1.getProjects().add(project1);
        employee1.getProjects().add(project2);
        employee2.getProjects().add(project2);
        session.save(employee1);
        session.save(employee2);
        session.getTransaction().commit();
        session.close();
        factory.close();

    }
}
