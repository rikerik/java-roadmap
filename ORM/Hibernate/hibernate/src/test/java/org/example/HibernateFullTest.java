package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;


public class HibernateFullTest {
// The SessionFactory in Hibernate is responsible for creating and managing Sessions,
// which provide a way to interact with the database. It is created during application startup
// and shared throughout the application. The SessionFactory handles configuration,
// thread-safety, database connections, and session creation.

    private SessionFactory sessionFactory;

    @BeforeEach
    protected void setUp() throws Exception {
        // A SessionFactory is set up once for an application
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    @AfterEach
    protected void tearDown() throws Exception {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    @Test
    public void testBasicUsage() {
        User user = new User("Erik", LocalDate.now());
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
    }

    @Test
    void hql_fetch_users() {
        User user = new User("Erik", LocalDate.now());
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<User> users = session.createQuery("select u from User u", User.class)
                .list(); //gets data from the class not from the table
        users.forEach(System.out::println);
        session.getTransaction().commit();
    }
}




