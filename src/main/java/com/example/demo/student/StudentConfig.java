package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student sura = new Student("Sura", LocalDate.of(2000, JANUARY, 5), "sura@gmail.com");
            Student ssosso = new Student("Sohee", LocalDate.of(2008, MAY, 16), "ssosso@gmail.com");
            studentRepository.saveAll(List.of(sura, ssosso));
        };
    }
}
