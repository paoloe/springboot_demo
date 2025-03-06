package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student paolo = new Student(
                    "Paolo",
                    "test.email@com",
                    21
            );

            Student paolo2 = new Student(
                    "Paolo2",
                    "test2.email@com",
                    22
            );

            //invoke repository to save
            repository.saveAll(
                    List.of(paolo, paolo2)
            );

        };
    }

}
