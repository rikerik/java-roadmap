package org.example;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
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

    //  private SessionFactory sessionFactory; //for hibernate
    private EntityManagerFactory emf; //for jpa

    //In the code I renamed the variables, so session became 'em' and sessionFactory became 'emf'


    @BeforeEach
    protected void setUp() throws Exception {
        // A SessionFactory is set up once for an application
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            emf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    @AfterEach
    protected void tearDown() throws Exception {
        if (emf != null) {
            emf.close();
        }
    }

    @Test
    public void testBasicUsage() {
        User user = new User("Erik", LocalDate.now());
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    @Test
    void hql_fetch_users() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<User> users = em.createQuery("select u from User u", User.class)
                .getResultList(); //gets data from the class not from the table
        users.forEach(System.out::println);
        em.getTransaction().commit();
    }


    @Test
    public void criteria_api(){
        EntityManager em = emf.createEntityManager(); // Create an EntityManager instance
        CriteriaBuilder cb = em.getCriteriaBuilder(); // Get a CriteriaBuilder

        CriteriaQuery<User> criteriaQuery = cb.createQuery(User.class); // Create a CriteriaQuery for User entities
        Root<User> root = criteriaQuery.from(User.class); // Define the root entity for the query

        // Specify the selection and filtering criteria for the query
        criteriaQuery.select(root) // Select the root entity (User)
                .where(cb.equal(root.get(User_.NAME), "Erik")); // Filter based on the User's name

        TypedQuery<User> query = em.createQuery(criteriaQuery); // Create a TypedQuery with the CriteriaQuery
        List<User> results = query.getResultList(); // Execute the query and get the results
        results.forEach(System.out::println); // Print each User object

        em.close(); // Close the EntityManager
    }
}




