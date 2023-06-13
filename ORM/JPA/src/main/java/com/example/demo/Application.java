package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;


@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Erik = new Student("Erik", "Bakó", "erik@gmail.com", 20);
            Student John = new Student("John", "Doe", "johndoe@gmail.com", 25);
            studentRepository.save(Erik);
            studentRepository.save(John);

            // fetch all students
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Student student : studentRepository.findAll()) {
                log.info(student.toString());
            }
            log.info("");

            // fetch an individual student by ID
            Student student = studentRepository.findById(1L);
            log.info("Student found with findById(1L):");
            log.info("--------------------------------");
            log.info(student.toString());
            log.info("");

            // fetch students by last name
            log.info("student found with findByLastName('Bakó'):");
            log.info("--------------------------------------------");
            studentRepository.findByLastName("Bakó").forEach(b -> {
                log.info(b.toString());
            });
            log.info("");
        };
    }
}

