package com.test2.TestSample2.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class  StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student niels = new Student(
                    "Niels",
                    "nielsgroeneveld@gmail.com",
                    LocalDate.of(1993, Month.MARCH, 3),
                    "Male"
            );

            Student alex= new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5),
                    "Male"
            );

            repository.saveAll(
                    List.of(niels, alex)
            );
        };
    }
}
