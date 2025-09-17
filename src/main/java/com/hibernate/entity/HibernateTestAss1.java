package com.hibernate.entity;

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
        User user = new User("gopi");
        Profile profile = new Profile("9848113355", "24 ste nw");
        user.setProfile(profile);
        profile.setUser(user);
        session.save(user);
        session.getTransaction().commit();
        session.close();
        factory.close();

    }
}
