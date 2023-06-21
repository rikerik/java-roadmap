package com.rikerik;

import com.rikerik.dao.DAO;
import com.rikerik.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JdbctemplateApplication {

    private static DAO<Course> dao;

    public JdbctemplateApplication(DAO<Course> dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbctemplateApplication.class, args);

        System.out.println("\n Create Course -----------------------------------\n");
        Course springVue = new Course("Spring Boot + Vue", "New Course", "https://www.examplelink.com");
        dao.create(springVue);


        System.out.println("\n All Courses -----------------------------------\n");
        List<Course> courses = dao.list();
        courses.forEach(System.out::println);


    }

}
